import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int P = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		char[] stone = new char[101];
		for(int i = 0; i < 101; i++) stone[i] = 'B';
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int position = Integer.parseInt(st.nextToken());
			char dir = st.nextToken().charAt(0);
			
			if(dir == 'R') 
				for(int j = position + 1; j < 101; j++) stone[j] = (stone[j] == 'B') ? 'R' : (stone[j] == 'R') ? 'G' : 'B';
			else 
				for(int j = position - 1; j > 0; j--) stone[j] = (stone[j] == 'B') ? 'R' : (stone[j] == 'R') ? 'G' : 'B';
			
		}
		
		int m = 0;
		int h = 0;
		int a = 0;
		for(int i = 1; i < 101; i++) {
			
			switch(stone[i]) {
				case 'R' : h++; break;
				case 'B' : m++; break;
				case 'G' : a++; break;
			}
		}
		
		String mM = String.format("%.2f", (double)P/100*m);
		String hM = String.format("%.2f", (double)P/100*h);
		String aM = String.format("%.2f", (double)P/100*a);
		
		System.out.println(mM);
		System.out.println(hM);
		System.out.println(aM);
	}
}
