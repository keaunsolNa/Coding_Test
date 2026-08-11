import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;	   
	   
	   st = new StringTokenizer(br.readLine());
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   st = new StringTokenizer(br.readLine());
	   String A = st.nextToken();
	   String B = st.nextToken();
		   
	   int[] arr = new int[N + M];
	   int idx = 0;
	   
	   for(int i = 0; i < Math.min(N, M); i++) {
		   
		   arr[idx] = charToInt(A.charAt(i));
		   arr[idx + 1] = charToInt(B.charAt(i));
		   
		   idx += 2;
	   }
	   
	   if(N != M) {
		   
		   if(N < M) {
			   for(int i = N; i < M; i++) {
				   arr[idx] = charToInt(B.charAt(i));
				   idx++;
			   }
		   }
		   else {
			   for(int i = M; i < N; i++) {
				   arr[idx] = charToInt(A.charAt(i));
				   idx++;
			   }
		   }
	   }
	   
	   
	   while(arr.length != 2) {
		   
		   int[] arrClone = new int[arr.length - 1];
		   for(int i = 0; i < arr.length - 1; i++) {
			   
			   int temp = arr[i] + arr[i + 1];
			   
			   if(temp >= 10) 
				   arrClone[i] = temp % 10;
			   else arrClone[i] = temp;
			   
		   }
		   
		   arr = arrClone;
	   }
	   
	   int percent = Integer.parseInt(arr[0] + "" + arr[1]);
	   
	   System.out.println(percent + "%");
	   
   }

   private static int charToInt (char temp) {
	   
	   switch(temp) {
	   
	   		case 'E' : 
	   			
	   			return 4;
	   			
	   		case 'A' :
	   		case 'F' : 
	   		case 'H' :
	   		case 'K' :
	   		case 'M' :
	   			
	   			
	   			return 3;
	   			
	   		case 'B' :
	   		case 'D' :
	   		case 'N' :
	   		case 'P' :
	   		case 'Q' :
	   		case 'R' :
	   		case 'T' :
	   		case 'X' :
	   		case 'Y' :
	   			
	   			return 2;
	   			
	   		case 'C' :
	   		case 'G' :
	   		case 'I' :
	   		case 'J' :
	   		case 'L' :
	   		case 'O' :
	   		case 'S' :
	   		case 'U' :
	   		case 'V' :
	   		case 'W' :
	   		case 'Z' :
	   			
	   			return 1;
	   }
	   
	   return 0;
   }
}
