import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		for(int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			
			int start = Integer.parseInt(st.nextToken()) - 1;
			int end = Integer.parseInt(st.nextToken()) - 1;
			
			int num = (Math.abs(end - start + 1) / 2);
            int count = 0;
            
            for (int j = 0; j < num; j++) {
            	
                int tmp = arr[start + count];
                arr[start + count] = arr[end - count];
                arr[end - count] = tmp;
                count++;
            }
		}
		
		for (int b : arr) {
			System.out.print(b + " ");
		}
		
			
	}
}
