import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	   int[] table = new int[4];
	   table[0] = Integer.parseInt(br.readLine());
	   table[1] = Integer.parseInt(br.readLine());
	   table[2] = Integer.parseInt(br.readLine());
	   table[3] = Integer.parseInt(br.readLine());
	   int P = Integer.parseInt(br.readLine());
	   
	   Arrays.sort(table);
	   
	   if(table[0] == table[3]) System.out.println(1);
	   else {
		   
		   table[0] += P;
		   
		   if(table[0] == table[1] && table[1] == table[2] && table[2] == table[3]) System.out.println(1);
		   else System.out.println(0);
		   
	   }
	   
		   
   }
}
