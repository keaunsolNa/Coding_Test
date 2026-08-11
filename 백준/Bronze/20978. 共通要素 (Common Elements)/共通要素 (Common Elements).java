import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(arr);
		Set<Integer> list = new TreeSet<>();
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			
			int temp = Integer.parseInt(st.nextToken());
			for(int j = 0; j < N; j++) {
				
				if(arr[j] == temp) {
					list.add(temp);
					break;
				}
					
				if(arr[j] > temp) break;
			}
		}

		if(list.isEmpty()) System.exit(0);;
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
