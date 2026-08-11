import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		while(true) {
			
			if(arr[0] > arr[1]) {
				int temp = arr[1];
				arr[1] = arr[0];
				arr[0] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
			}
			
			if(arr[1] > arr[2]) {
				int temp = arr[2];
				arr[2] = arr[1];
				arr[1] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}

			if(arr[2] > arr[3]) {
				int temp = arr[3];
				arr[3] = arr[2];
				arr[2] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}
			
			if(arr[3] > arr[4]) {
				int temp = arr[4];
				arr[4] = arr[3];
				arr[3] = temp;
				
				for (int i : arr) System.out.print(i + " ");
				System.out.println();
				
			}
			
			
			if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4]) break;
		}
		
	}
}
