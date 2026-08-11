import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int totalPeople = 0;
	   int maxPeople = 0;
	   for(int i = 1; i <= 10; i++) {
		   st = new StringTokenizer(br.readLine(), " ");
		   int output = Integer.parseInt(st.nextToken());
		   int input = Integer.parseInt(st.nextToken());
		   
		   totalPeople += input;
		   totalPeople -= output;
		   
		   if(totalPeople > maxPeople) maxPeople = totalPeople;
	   }
	   
	   System.out.println(maxPeople);
	   
   }
}
