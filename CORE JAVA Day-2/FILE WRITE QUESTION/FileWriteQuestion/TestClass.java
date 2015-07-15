package ThreadLifeCycle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * class TestClass definition
 */
public class TestClass {
	
	/**
	 * variable definition
	 */
	static FileWriter fileWriter;
	
	/**
	 * main() method call
	 * @param s
	 */
	public static void main(String s[]){
		
		/**
		 * variable count for counting the number of threads
		 */
		int count;
		
		/**
		 * try and catch block to handle exception thrown by FileWriter class
		 */
		try{
		File file=new File("output.txt");;
		 fileWriter=new FileWriter(file);
		}
		
		catch(IOException exception){}
		
		for(count=1;count<=100;count++)
		{
			Thread thread=new Thread(new MyThreads("Thread "+count));
			thread.start();
		}
		
		try{
			fileWriter.close();
		}
		
		catch(IOException exception){}
	}

}
