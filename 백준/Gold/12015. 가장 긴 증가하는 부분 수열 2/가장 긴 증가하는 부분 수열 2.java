import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int N = Integer.parseInt(br.readLine());
	   int[] number = new int[N];
	   int[] lts = new int[N];
	   
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   for(int i = 0; i < N; i++) number[i] = Integer.parseInt(st.nextToken());
	   
	   lts[0] = number[0];
	   int length = 1;
	   
	   for(int i = 1; i < N; i++) {
		   
		   int search = number[i];
		   
		   if(lts[length - 1] < search) {
			   length++;
			   lts[length - 1] = search;
		   }
		   
		   else {
			   
			   int first = 0;
			   int last = length;
			   
			   while(first < last) {
				  
				   int mid = (first + last) / 2;	
				   
				   if(lts[mid] < search) first = mid + 1;
				   else last = mid;
			   }
               
               lts[first] = search;
		   }
	   }

	   System.out.println(length);
	}
}
