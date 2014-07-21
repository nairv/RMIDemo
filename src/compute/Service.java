package compute;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.naming.Context;

@SuppressWarnings("serial")
public class Service extends UnicastRemoteObject implements ServiceInterface {
	private String msg= null;
	private int staticInt = 0;
	public int getStaticInt() {
		return staticInt;
	}

	public void setStaticInt(int staticInt) {
		this.staticInt = staticInt;
	}
	 public void increaseStaticInt(){
		 this.staticInt++;
	 }

	public Service(String msg) throws RemoteException {
		super();

		this.msg = msg;
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	@Override
	public String compute() throws RemoteException {
		// TODO Auto-generated method stub
		return this.msg;
	}

}
