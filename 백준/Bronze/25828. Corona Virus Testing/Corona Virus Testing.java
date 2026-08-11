import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
	   
	   int group = Integer.parseInt(st.nextToken());
	   int peopleInGroup = Integer.parseInt(st.nextToken());
	   int needTestCase = Integer.parseInt(st.nextToken());
	   
	   int totalPeople = group * peopleInGroup;
	   
	   int testCase = group + (needTestCase * peopleInGroup); 
	   
	   if(totalPeople > testCase) {
		   System.out.println(2);
	   } else if (totalPeople == testCase) {
		   System.out.println(0);
	   } else {
		   System.out.println(1);
	   }
   }
}
