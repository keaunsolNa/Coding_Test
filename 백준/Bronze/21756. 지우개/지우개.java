import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int n = Integer.parseInt(br.readLine());
	   List<Integer> list = new ArrayList<>();
	   for(int i = 0; i < n; i++) list.add(i + 1);
	   
	   if(list.size() == 1) {
		   System.out.println(list.get(0));
		   return;
	   }
	   
	   while(true) {
		   
		   for(int i = 0; i < list.size(); i++) if(i == 0 || i % 2 == 0) list.set(i, 0);
		   list.removeAll(Arrays.asList(Integer.valueOf(0)));
		   if(list.size() == 1) break;
	   }
	   
	   System.out.println(list.get(0));
	   
   }
}
