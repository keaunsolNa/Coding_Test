import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ",");
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		while(K --> 0) {
			
			int[] arrtemp = new int[N--];
			for(int i = 0; i < N; i++) arrtemp[i] = arr[i+1] - arr[i];
			
			arr = arrtemp;
		}
		
		for(int i = 0; i < N; i++) {
			if(i != N - 1) System.out.print(arr[i] + ",");
			else System.out.print(arr[i]);
		}
		
	}
}
