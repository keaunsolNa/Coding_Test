import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int totalPlayTime = 0;
		for(int i = 0; i < N; i++) {
			String[] time = br.readLine().split(":");
			totalPlayTime += Integer.parseInt(time[0])*60 + Integer.parseInt(time[1]); 
		}
		int playTime = totalPlayTime - ((N-1)*C);
		String pH = playTime/3600 + "";
		String pM = playTime%3600/60 + "";
		String pS = playTime%60 + "";
		
		if(pH.length() == 1) {
			pH = "0" + pH;
		}
		if(pM.length() == 1) {
			pM = "0" + pM;
		}
		if(pS.length() == 1) {
			pS = "0" + pS;
		}
		
		System.out.println(pH + ":" + pM + ":" + pS);
	}
}
