import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String input = br.readLine();
	   int num = 1;
	   
	   String start = input.substring(0, 1);
	   
	   if(start.equals("c")) num *= 26;
	   else num *= 10;
	   
	   for(int i = 0; i < input.length() - 1; i++) {
		   
		   String a = input.substring(i, i + 1);
		   String b = input.substring(i + 1, i + 2);
		   
		   if(a.equals("c")) {
			   if(a.equals(b)) num *= 25;
			   else num *= 10;
		   }

		   else if(a.equals("d")){
			   if(a.equals(b)) num *= 9;
			   else num *= 26;
		   }
	   }
	   
	   System.out.println(num);
   }
}
