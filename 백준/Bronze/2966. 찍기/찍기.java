import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String input = br.readLine();
		char[] A = {'A', 'B', 'C'};
		char[] B = {'B', 'A', 'B', 'C'};
		char[] C = {'C', 'C', 'A', 'A', 'B', 'B'};
		int AW = 0;
		int BW = 0;
		int CW = 0;
		for(int i = 0; i < N; i++) {
			
			char t = input.charAt(i);
			
			
			if(A[i%3] == t) AW++;
			if(B[i%4] == t) BW++;
			if(C[i%6] == t) CW++;
			
		}
		
		System.out.println(Math.max(AW, Math.max(CW, BW)));
		
		if (AW > BW && AW > CW) System.out.println("Adrian");
		else if (BW > CW && BW > AW) System.out.println("Bruno");
		else if (CW > AW && CW > BW) System.out.println("Goran");
		else {
			
			if(AW == BW && AW == CW) System.out.println("Adrian\nBruno\nGoran");
			else if(AW == BW && AW > CW) System.out.println("Adrian\nBruno");
			else if(AW == CW && AW > BW) System.out.println("Adrian\nGoran");
			else if(BW == CW && BW > AW) System.out.println("Bruno\nGoran");
			
		}
		
	}
}
