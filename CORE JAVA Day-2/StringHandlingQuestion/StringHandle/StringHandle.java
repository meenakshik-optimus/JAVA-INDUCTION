package StringHandle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * class StringHandle definition
 */
public class StringHandle{
	
	/**
	 * main() method
	 * @param s
	 * @throws IOException
	 */
	public static void main(String s[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string=br.readLine();
		
		/**
		 * split method to split the string given
		 */
		String tokens[]=string.split("\",\"");
		
		/**
		 * displaying the output to the console
		 */
		for(int count=0;count<tokens.length;count++){
			System.out.println(tokens[count]);
		}
	}

}
