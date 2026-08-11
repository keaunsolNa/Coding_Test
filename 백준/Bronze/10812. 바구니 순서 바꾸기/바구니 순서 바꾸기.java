import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) arr[i] = i + 1;
		
		while(M -- > 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken()) - 1;
			
			int[] temp = new int[j - i + 1];
			int idx = k;
			
			for(int t = 0; t < temp.length; t++) {
				if(idx > j) idx = i;
				temp[t] = arr[idx];
				idx++;
			}
			
			int t = 0;
			for(int a = i; a <= j; a++) arr[a] = temp[t++];
			
		}
		for (int l : arr) System.out.print(l + " ");
	}
}
