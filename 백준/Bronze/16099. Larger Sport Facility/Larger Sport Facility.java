import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());

	   for(int i = 0; i < T; i++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   long lt = Integer.parseInt(st.nextToken());
		   long wt = Integer.parseInt(st.nextToken());
		   long le = Integer.parseInt(st.nextToken());
		   long we = Integer.parseInt(st.nextToken());
		   
		   if(lt * wt > le * we) {
			   System.out.println("TelecomParisTech");
		   } else if(lt * wt < le * we) {
			   System.out.println("Eurecom");
		   } else {
			   System.out.println("Tie");
		   }
	   }
	   
   }
}
