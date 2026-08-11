import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int L = Integer.parseInt(br.readLine());
	   int R = Integer.parseInt(br.readLine());

	   List<Integer> branch = new ArrayList<>();
	   
	   while(L > 5) {
		   L = R * L / 100;
		   branch.add(L);
	   }

	   int root = 2;
	   int sum = 0;
	   for(int i = 0; i < branch.size() - 1; i++) {
		   sum += root * branch.get(i);
		   root *= 2;
	   }
	   
	   System.out.println(sum);
       
       
   }
}
