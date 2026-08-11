import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int[] A = new int[10];
		for(int i = 0; i < 10; i++) A[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] B = new int[10];
		for(int i = 0; i < 10; i++) B[i] = Integer.parseInt(st.nextToken());
		
		int AW = 0;
		int BW = 0;
		String lastW = "D";
		for(int i = 0; i < 10; i++) {
			
			if(A[i] > B[i]) {
				lastW = "A";
				AW += 3;
			}
			else if(B[i] > A[i]) {
				lastW = "B";
				BW += 3;
			} else {
				AW += 1;
				BW += 1;
			}
		}
		
		System.out.println(AW + " " + BW);

		if(AW > BW) System.out.print("A");
		else if(AW < BW) System.out.print("B");
		else {
			if(lastW.equals("D")) System.out.println("D");
			else System.out.println(lastW);
		}
		
	}
}
