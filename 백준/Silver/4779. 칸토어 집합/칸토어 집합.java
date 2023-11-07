import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
			  
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	   
    
	   String input = "";
	   String[] arr = new String[13];
	   arr[0] = "-";
	   arr[1] = "- -";
	   
	   int buf = 3;
	   for(int i = 2; i < 13; i++) {
		   
		   StringBuilder sb = new StringBuilder();
		   for(int j = 0; j < buf; j++) sb.append(" ");
		   
		   arr[i] =  arr[i - 1] + sb.toString() + arr[i - 1];
		   buf *= 3;
	   }
	   
	   while((input = br.readLine()) != null) {
		   
		   int N = Integer.parseInt(input);
		   System.out.println(arr[N]);
		   
	   }
   }
}