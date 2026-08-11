import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   int N = Integer.parseInt(br.readLine());
	   
	   for(int i = N; i >= 0; i--) {
		   
		   if(i == 0) {
			   
			   if(N == 1) 
				   sb.append("No more bottles of beer on the wall, no more bottles of beer.\n"
                           + "Go to the store and buy some more, " + N + " bottle of beer on the wall.\n");
			   else
				   sb.append("No more bottles of beer on the wall, no more bottles of beer.\n"
                           + "Go to the store and buy some more, " + N + " bottles of beer on the wall.\n");
			   
		   } else if(i == 1) 
			   sb.append("1 bottle of beer on the wall, 1 bottle of beer.\n"
                        + "Take one down and pass it around, no more bottles of beer on the wall.\n");
		   else if(i == 2)
			   sb.append("2 bottles of beer on the wall, 2 bottles of beer.\n"
                       + "Take one down and pass it around, 1 bottle of beer on the wall.\n");
		   else
			   sb.append(i + " bottles of beer on the wall, " + i + " bottles of beer.\n"
                       + "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
	   
		   sb.append("\n");
	   }
	   
	   
	   sb.deleteCharAt(sb.length() - 1);
	   sb.deleteCharAt(sb.length() - 1);
	   System.out.print(sb);
	   
   }
}
