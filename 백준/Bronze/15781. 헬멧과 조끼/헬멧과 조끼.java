import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");
		int halmet = 0;
		for(int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(halmet < temp) halmet = temp;
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		int armor = 0;
		for(int i = 0; i < M; i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(armor < temp) armor = temp;
		}
		
		System.out.println(halmet + armor);
		
	}
}
