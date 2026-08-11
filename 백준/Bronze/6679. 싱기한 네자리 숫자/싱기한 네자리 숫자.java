import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for(int i = 2992; i < 10000; i++) {
			String A = Integer.toString(i, 10);
			int sumA = 0;
			for(int j = 0; j < A.length(); j++) sumA += Character.getNumericValue(A.charAt(j));
			String B = Integer.toString(i, 12);
			int sumB = 0; 
			for(int j = 0; j < B.length(); j++) {
				switch(B.charAt(j)) {
					case 'a' : sumB += 10; break;
					case 'b' : sumB += 11; break;
					default : sumB += Character.getNumericValue(B.charAt(j));
				}
			}
			
			if(sumA != sumB) continue;
			String C = Integer.toString(i, 16);
			int sumC = 0;
			for(int j = 0; j < C.length(); j++) {
				switch(C.charAt(j)) {
					case 'a' : sumC += 10; break;
					case 'b' : sumC += 11; break;
					case 'c' : sumC += 12; break;
					case 'd' : sumC += 13; break;
					case 'e' : sumC += 14; break;
					case 'f' : sumC += 15; break;
					default : sumC += Character.getNumericValue(C.charAt(j));
				}
			}
			
			if(sumB == sumC) sb.append(i).append("\n");
		}
		
		System.out.println(sb);
	}
}
