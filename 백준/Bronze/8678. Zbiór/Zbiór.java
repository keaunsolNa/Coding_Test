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
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   StringTokenizer st;
	   
	   while(N --> 0) {
		   
		   st = new StringTokenizer(br.readLine());
		   int A = Integer.parseInt(st.nextToken());
		   int B = Integer.parseInt(st.nextToken());
		   
		   boolean chk = true;
		   for(int i = 1; i <= A; i++) {
			   if(A % i == 0 && B % i != 0) {
				   sb.append("NIE" + "\n");
				   chk = false;
				   break;
			   }
		   }
		   
		   if(chk) sb.append("TAK" + "\n");
		   sb.append("\n");
	   }
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
   }
}
