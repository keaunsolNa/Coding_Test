import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			
			int hab = arr[i];
			int sum = 0;
			for(int j = 0; j < arr.length; j++) 
				if(i != j) sum += arr[j];
			
			if(hab == sum) {
				System.out.println(hab);
				return;
			};
		}
   }
}