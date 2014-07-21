package compute;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServiceInterface extends Remote{
	<T> T compute() throws RemoteException;
	public void setStaticInt(int staticInt) throws RemoteException;
	public int getStaticInt() throws RemoteException;
	public void increaseStaticInt() throws RemoteException;
}
