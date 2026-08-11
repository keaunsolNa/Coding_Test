import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		long speed = arr[n - 1];
		for(int i = n - 2; i >= 0; i--) {
			
			if(arr[i] > speed) speed = arr[i];
			
			else if(speed % arr[i] != 0) 
				speed = (speed / arr[i] + 1) * arr[i];
		}
		
		System.out.println(speed);
	}
}
