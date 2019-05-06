import java.io.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;
import  java.lang.Thread;

public class Server extends UnicastRemoteObject implements TimeTask 
{
    static boolean runs = true;
    protected static String adminName = "admin";
    protected static String adminPassword = "admin";

    class Time{
        String password;
        int time;
        Time(String password){
            this.password=password;
            time=0;
        }
        Time(String password, int time){
            this.password=password;
            this.time=time;
        }
    }

    static Map<String,Time> times = new HashMap<>();
    static protected Integer nowid = 0;
    static protected ArrayList <Integer> nowtimes = new ArrayList<>();
    static protected ArrayList <String> connectedNames = new ArrayList<>();
    static protected ArrayList <String> connectedPasswords = new ArrayList<>();
    public Server() throws RemoteException{
        super();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            int number = Integer.parseInt(reader.readLine());
            for(int i=0;i<number;i++)
            {
                String name = reader.readLine();
                String password = reader.readLine();
                int time = Integer.parseInt(reader.readLine());
                Time tmp = new Time(password,time);
                times.put(name,tmp);
            }
            reader.close();
        }
        catch (Exception e)
        {
        	System.err.println(e.getMessage());
        }
    }

    @Override
    public int register(String name, String password) throws RemoteException {
        int newid=-1;
        synchronized (connectedNames) 
        {
            if (connectedNames.contains(name))
                throw new RemoteException("Arleady connected");
            synchronized (nowid)
            {
                newid=nowid++;
            }
            connectedNames.add(name);
            connectedPasswords.add(password);
        }
        synchronized (times)
        {
            if(!times.containsKey(name))
            {
                Time  tmp = new Time(password);
                times.put(name,tmp);
            }
        }
        nowtimes.add(newid,0);
        return newid;
    }

    @Override
    public void unregister(String name, String password) throws RemoteException 
    {
        synchronized (connectedNames)
        {
            int idx = connectedNames.indexOf(name);
            if(connectedPasswords.get(idx).equals(password))
            {
                synchronized (times)
                {
                    Time thistime =times.get(name);
                    thistime.time+=nowtimes.get(idx);
                }
                nowtimes.set(idx,-1);
            }
            else
                throw new RemoteException("You are not this person");
        }
    }

    
    public static void stopServer() throws RemoteException 
    {
                        try
                        {
                            BufferedWriter out = new BufferedWriter(new FileWriter("data.txt"));
                            out.write(times.size()+"");
                            out.newLine();
                            for (Map.Entry<String, Time> entry : times.entrySet())
                            {
                                out.write(entry.getKey());
                                out.newLine();
                                out.write(entry.getValue().password);
                                out.newLine();
                                out.write(entry.getValue().time+"");
                                out.newLine();
                            }
                            out.close();
                        }
                        catch (Exception e)
                        {
                        	System.err.println(e.getMessage());
                        }
        runs=false;

    }

    public static void addTime(int id) throws RemoteException
    {
            nowtimes.set(id,nowtimes.get(id)+1);
    }

    public int check(int id) throws RemoteException
    {
    	return nowtimes.get(id);
    }
    public static void main(String[] args) throws Exception{

    	boolean start=false;
    	int acts=0;
    	Server server = new Server();
         String name = System.getProperty("work", "firstRemote");  
         Naming.rebind(name, server);
         // Tell the world we're up and running
         System.out.println("Server starts.");
        while (server.runs)
        {
        	Thread.sleep(1000);
        	int i=0;
        	while(i<nowtimes.size())
        	{
        		start=true;
        		if(nowtimes.get(i)!=-1)
        			addTime(i);
        		else 
        			acts++;
        		
        		i++;        		
        	}
        	
        	if(start==true && nowtimes.size()==acts)
        	{
        		stopServer();
        		break;
        	}
        	
        }
        System.out.println("Server ends.");
    }
}
