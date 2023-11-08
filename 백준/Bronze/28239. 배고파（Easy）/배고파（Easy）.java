import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			
			long M = Long.parseLong(br.readLine());
			boolean flag = false;
			for(long x = 0; x < 63; x++) {
				
				for(long y = 63; y >= 0; y--) {
					
					flag =(long)Math.pow(2, x) + (long)Math.pow(2, y) == M ? true : false;
                    if(flag) {
                        sb.append(x).append(" ").append(y).append("\n");
                        break;
                    }
				}
				if(flag) break;
			}
		}
		
		System.out.println(sb);
   }
}