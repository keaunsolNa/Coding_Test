import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int ds = Integer.parseInt(st.nextToken());
		int ys = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int dm = Integer.parseInt(st.nextToken());
		int ym = Integer.parseInt(st.nextToken());
		
		int sun = ys - ds;
		int mon = ym - dm;
		
		while(sun != mon) {
			
			if(sun < mon) sun += ys;
			else mon += ym;
		}
		System.out.println(sun);
   }
}