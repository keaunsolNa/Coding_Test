import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			int HA = Integer.parseInt(st.nextToken());
			int HB = Integer.parseInt(st.nextToken());
			int TA = Integer.parseInt(st.nextToken());
			int TB = Integer.parseInt(st.nextToken());
			
			if(HA == 0 && HB == 0 && TA == 0 && TB == 0) break;
			
			int time = HA * 60 + HB;
			int target = TA * 60 + TB;
			
			if(time < target) System.out.println(target - time);

			else System.out.println(1440 - time + target);
			
		}
	}
}
