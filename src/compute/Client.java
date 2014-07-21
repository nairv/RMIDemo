package compute;
import java.io.File;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
	public static void main(String args[]){
		try{

			//System.out.println("Hello");
			ServiceInterface s = (ServiceInterface)Naming.lookup("Hello");
			s.increaseStaticInt();
			;
			System.out.println(s.getStaticInt());;
			
			//s.setStaticInt(100);
			
			System.out.println(s.getStaticInt());
		}
		catch(Exception e){
			System.out.println("Client Exception :"+ e);
		}
	}

}
