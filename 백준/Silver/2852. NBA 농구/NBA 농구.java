import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t;
		int ntime;
		int time = 0;
		int t_a = 0;
		int t_b = 0;
		int s = 0;
		boolean chk;
		t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			st = new StringTokenizer(br.readLine());
			chk = st.nextToken().equals("1") ? true : false;
			String str = st.nextToken();
			
			ntime = (str.charAt(0) - '0') * 600;
			ntime += (str.charAt(1) - '0') * 60;
			ntime += (str.charAt(3) - '0') * 10;
			ntime += str.charAt(4) - '0';
			
			if(s > 0) t_a += ntime - time;
			if(s < 0) t_b += ntime - time;
			s += chk ? 1 : -1;
			time = ntime;
			
		}
		
		if(s > 0) t_a += 2880 - time;
		if(s < 0) t_b += 2880 - time;
		System.out.printf("%02d:%02d\n%02d:%02d\n", t_a / 60, t_a % 60, t_b / 60, t_b % 60);
		
	}
}
