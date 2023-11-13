import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		double MT = 0;
		double MP = 0;
		double JT = 0;
		double JP = 0;
		
		while(N --> 0) {

			st = new StringTokenizer(br.readLine());
			
			char MJ = st.nextToken().charAt(0);
			int point = Integer.parseInt(st.nextToken());
			
			if(MJ == 'M') { MT++; MP += point; }
			else { JT++; JP += point; }
		}
		
		double MA = (MT != 0) ? MP / MT : 0;  
		double JA = (JT != 0) ? JP / JT : 0;
		System.out.println(MA > JA ? "M" : JA > MA ? "J" : "V");
   }
}