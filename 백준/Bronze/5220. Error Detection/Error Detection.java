import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   int T = Integer.parseInt(br.readLine());
	   
	   while(T --> 0) {
		   st = new StringTokenizer(br.readLine());
		   int number = Integer.parseInt(st.nextToken());
		   int evenOrOdd = Integer.parseInt(st.nextToken());
		   
		   String binary = Integer.toBinaryString(number);
		   
		   int chk = 0;
		   for(int i = 0; i < binary.length(); i++) if(binary.charAt(i) == '1') chk++;
		   
		   int check = 0;
		   if(chk % 2 == 0) check = 0;
		   else check = 1;
		   
		   if(evenOrOdd == check) System.out.println("Valid");
		   else System.out.println("Corrupt");
	   }
   }
}
