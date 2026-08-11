import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int setMin = Integer.MAX_VALUE;
		int singMin = Integer.MAX_VALUE;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			setMin = Math.min(setMin, Integer.parseInt(st.nextToken()));
			singMin = Math.min(singMin, Integer.parseInt(st.nextToken()));
		}
		
		int justSing;
		int justSet;
		int useDouble;
		
		justSing = singMin * N;
		
		if(N % 6 == 0) justSet = setMin * (N / 6);
		else justSet = setMin * ((N / 6) + 1);
			
		useDouble = (setMin * (N / 6)) + (singMin * (N % 6));
		
		System.out.println(Math.min(Math.min(justSing, justSet), useDouble));
	}
}
