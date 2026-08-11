import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			int good = 0;
			int evil = 0; 
			st = new StringTokenizer(br.readLine());
			
			good += Integer.parseInt(st.nextToken()) * 1;
			good += Integer.parseInt(st.nextToken()) * 2;
			good += Integer.parseInt(st.nextToken()) * 3;
			good += Integer.parseInt(st.nextToken()) * 3;
			good += Integer.parseInt(st.nextToken()) * 4;
			good += Integer.parseInt(st.nextToken()) * 10;
					
			st = new StringTokenizer(br.readLine());
			
			evil += Integer.parseInt(st.nextToken()) * 1;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 2;
			evil += Integer.parseInt(st.nextToken()) * 3;
			evil += Integer.parseInt(st.nextToken()) * 5;
			evil += Integer.parseInt(st.nextToken()) * 10;
			
			if(good > evil) {
				System.out.println("Battle " + (i+1) + ": Good triumphs over Evil" );
			} else if(good < evil) {
				System.out.println("Battle " + (i+1) + ": Evil eradicates all trace of Good" );
			} else {
				System.out.println("Battle " + (i+1) + ": No victor on this battle field" );
			}
		}
		
	}
}
