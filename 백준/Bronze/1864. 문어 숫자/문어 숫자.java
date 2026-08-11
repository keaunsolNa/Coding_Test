import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = "";
	   while(!(input = br.readLine()).equals("#")) {
		   
		   String binaryNumber = "";
		   for(int i = 0; i < input.length(); i++) {
			   
			   switch(input.charAt(i)) {
		   		case '-' : binaryNumber += '0'; break;
		   		case '\\' : binaryNumber += '1'; break;
		   		case '(' : binaryNumber += '2'; break;
		   		case '@' : binaryNumber += '3'; break;
		   		case '?' : binaryNumber += '4'; break;
		   		case '>' : binaryNumber += '5'; break;
		   		case '&' : binaryNumber += '6'; break;
		   		case '%' : binaryNumber += '7'; break;
		   		case '/' : binaryNumber += "9"; break;
			   }
		   }
		
		   long answer = 0;
		   for(int i = 0; i < binaryNumber.length(); i++) {
			   
			   if(binaryNumber.charAt(i) != '9') 
				   answer += Character.getNumericValue(binaryNumber.charAt(i)) * (Math.pow(8, binaryNumber.length() - i - 1));
			   else  answer -= Math.pow(8, binaryNumber.length() - i - 1);
		   }
		   
		   System.out.println(answer);
	   }
   }
}
