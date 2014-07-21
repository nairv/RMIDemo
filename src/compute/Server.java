package compute;
import java.rmi.Naming;

import javax.naming.Context;
public class Server {
	public static void main (String[] argv) {
	    try {
	        try 
	        {
	        	System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");  
	            System.setProperty(Context.PROVIDER_URL, "rmi://127.0.0.1:1099");
	            java.rmi.registry.LocateRegistry.createRegistry(1099);
	        }
	        catch (Exception e) 
	        {
	        e.printStackTrace();
	        }
	    Service obj = new Service("Hello , World!");
	      Naming.rebind ("Hello", obj);
	      System.out.println ("Hello Server is ready.");
	    } catch (Exception e) {
	      System.out.println ("Hello Server failed: " + e);
	    }
	}
}
