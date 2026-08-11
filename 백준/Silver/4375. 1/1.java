import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			
			int num = Integer.parseInt(input);
			int k = 0;
		
			for(int i = 1; ; i++) {
				
				k = k * 10 + 1;
				k = k % num;
				
				if(k == 0) {
					sb.append(i + "\n");
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
}
