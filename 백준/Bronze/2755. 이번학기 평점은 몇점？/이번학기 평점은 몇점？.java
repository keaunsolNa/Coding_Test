import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
	   
	   int T = Integer.parseInt(br.readLine());
	   
	   double sum = 0;
	   int sumCredit = 0;
	   for(int i = 0; i < T; i++) {
		   st = new StringTokenizer(br.readLine());
		   
		   st.nextToken();
		   int credit = Integer.parseInt(st.nextToken());

		   String p = st.nextToken();
		   double point = 0;
		   
		   switch(p) {
		   
		   		case "A+" : point += 4.3; break;
		   		case "A0" : point += 4.0; break;
		   		case "A-" : point += 3.7; break;
		   		case "B+" : point += 3.3; break;
		   		case "B0" : point += 3.0; break;
		   		case "B-" : point += 2.7; break;
		   		case "C+" : point += 2.3; break;
		   		case "C0" : point += 2.0; break;
		   		case "C-" : point += 1.7; break;
		   		case "D+" : point += 1.3; break;
		   		case "D0" : point += 1.0; break;
		   		case "D-" : point += 0.7; break;
		   		case "F" : point += 0.0; break;
		   			
		   }
		   
		   sum += (point * credit);
		   sumCredit += credit;
	   }
	   
	   System.out.printf("%.2f", sum/sumCredit);
   }
}
