import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		String B = br.readLine();
		int Ahh = Integer.parseInt(A.split(":")[0]);
		int Amm = Integer.parseInt(A.split(":")[1]);
		int Ass = Integer.parseInt(A.split(":")[2]);

		int Bhh = Integer.parseInt(B.split(":")[0]);
		int Bmm = Integer.parseInt(B.split(":")[1]);
		int Bss = Integer.parseInt(B.split(":")[2]);
		
		int totalA = (Ahh*3600) + (Amm*60) + Ass;
		int totalB = (Bhh*3600) + (Bmm*60) + Bss;
		
		int time = 0;
		if(totalA >= totalB) {
			time = 86400 - totalA + totalB;
		} else {
			time = totalB - totalA;
		}

		String H = time / 60 / 60 + ""; 
		String M = time / 60 % 60 + "";
		String S = time % 60 + "";
		
		if(H.length()==1) {
			H = "0" + H;
		}
		if(M.length()==1) {
			M = "0" + M;
		}
		if(S.length()==1) {
			S = "0" + S;
		}
		
		System.out.print(H + ":" + M + ":" + S);
		
		
		
	}
}
