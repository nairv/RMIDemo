package compute;

import java.io.File;
import java.io.IOException;

public class Launcher {
	static class JavaProcess{
		public static int  exec(Class klass) throws IOException,InterruptedException {
			String javaHome = System.getProperty("java.home");
			String javaBin = javaHome +
			File.separator + "bin" +
			File.separator + "java";
			String classpath = System.getProperty("java.class.path");
			String className = klass.getCanonicalName();
			
			ProcessBuilder builder = new ProcessBuilder(
			javaBin, "-cp", classpath, className);
			builder.inheritIO();
			
			System.out.println(javaHome);
			System.out.println(javaBin);
			System.out.println(classpath);
			System.out.println(className);
			
			Process process = builder.start();
			//Thread.sleep(5000);
			//process.destroy();;
			//process.waitFor();
			//process.notify();
			process.notifyAll();
			
			System.out.println(process.exitValue());
			return process.exitValue();
			//return 1;
		}
	}
	
	public static void main(String args[]) throws IOException, InterruptedException{
		Class s = Server.class;
		JavaProcess.exec(s);
		Class c = Client.class;
		JavaProcess.exec(c);
	}
}
