import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st; 
	   st = new StringTokenizer(br.readLine());
	   int t1 = Integer.parseInt(st.nextToken());
	   int t2 = Integer.parseInt(st.nextToken());
	   
	   int startTime = t1 * 60 + t2;
	   
	   int t3 = Integer.parseInt(br.readLine());
	   st = new StringTokenizer(br.readLine());
	   int t4 = Integer.parseInt(st.nextToken());
	   int t5 = Integer.parseInt(st.nextToken());
	   
	   int goingTime = t4 * 60 + t5;
	   
	   int stu = Integer.parseInt(br.readLine());
	   
	   int t6 = Integer.parseInt(br.readLine());
	   int totalT3 = t6 * (stu + 1);
	   
	   
	   int ansM = startTime -  goingTime - totalT3 - t3 - 10;
	   
	   int H = ansM / 60;
	   int M = ansM % 60;
	   
	   if(H < 10) {
		   
		   if(M < 10) System.out.println("0" + H + " " + "0" + M);
		   else System.out.println("0" + H + " " + M);
		   
	   } else if(M < 10) {
		   
		   System.out.println(H + " 0" + M);
	   } else {
		   
		   System.out.println(H + " " + M);
		   
	   }
	   
   }
}
