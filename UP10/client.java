import java.rmi.Naming;


public class client {

	 public static void main(String[] args) throws Exception
	 { 
		 System.out.println("Client Starts");
    	String url = System.getProperty("work", "rmi:///firstRemote");		
    	TimeTask timeTask = (TimeTask) Naming.lookup(url);
        int myid;
        myid=timeTask.register("Ivan","12342");
        for(int i=0;i<7;i++)
        {
            Thread.sleep(1000);
        }
        System.out.println("Потраченное время="+timeTask.check(myid));
        timeTask.unregister("Ivan","12342");
        System.out.println("Client ends");
    }
}
