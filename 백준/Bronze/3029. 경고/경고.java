import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] before = br.readLine().split(":");
		String[] after = br.readLine().split(":");
		
		int beforeSecond = Integer.parseInt(before[2]) + (Integer.parseInt(before[1])*60) + (Integer.parseInt(before[0])*3600);
		int afterSecond = Integer.parseInt(after[2]) + (Integer.parseInt(after[1])*60) + (Integer.parseInt(after[0])*3600);
		int time = afterSecond - beforeSecond;
		
		if(time < 0) {
			time = (86400 - beforeSecond) + afterSecond;
		} 
		
		String H = time/3600+"";
		String M = time%3600/60+"";
		String S = time%60+"";
		
		if(H.length() == 1) {
			H = "0"+H;
		} 
		if(M.length() == 1) {
			M = "0"+M;
		}
		if(S.length() == 1) {
			S = "0"+S;
		}
		
		if(H.equals("00") && M.equals("00") && S.equals("00")) {
			System.out.println("24:00:00");
		} else {
			System.out.println(H + ":" + M + ":" + S);
		}
	}
}
