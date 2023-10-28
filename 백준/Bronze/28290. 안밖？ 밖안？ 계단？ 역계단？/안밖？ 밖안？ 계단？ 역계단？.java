import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
	
		switch(input) {
		
			case "fdsajkl;" :
			case "jkl;fdsa" : System.out.println("in-out");  break;
			
			case "asdf;lkj" :
			case ";lkjasdf" : System.out.println("out-in"); break;
			
			case "asdfjkl;" : System.out.println("stairs"); break;
			
			case ";lkjfdsa" : System.out.println("reverse"); break;
			
			default : System.out.println("molu"); break;
		}
	}
}
