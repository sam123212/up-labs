import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TimeTask extends Remote {

    public int register(String name, String password) throws RemoteException;
    public void unregister(String name, String password) throws RemoteException;
    public int check(int id) throws RemoteException;

}
