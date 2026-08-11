import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String two   = "* *\n *";
		String three = "*   *\n * *\n  *";
		String four  = "*     *\n *   *\n  * *\n   *";
		String five  = "*       *\n *     *\n  *   *\n   * *\n    *";
		String six   = "*         *\n *       *\n  *     *\n   *   *\n    * *\n     *";
		String seven = "*           *\n *         *\n  *       *\n   *     *\n    *   *\n     * *\n      *";
		String eight = "*             *\n *           *\n  *         *\n   *       *\n    *     *\n     *   *\n      * *\n       *";
		String nine  = "*               *\n *             *\n  *           *\n   *         *\n    *       *\n     *     *\n      *   *\n       * *\n        *";
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			
			switch(Integer.parseInt(st.nextToken())) {
				
				case 2 : sb.append(two); break;
				case 3 : sb.append(three); break;
				case 4 : sb.append(four); break;
				case 5 : sb.append(five); break;
				case 6 : sb.append(six); break;
				case 7 : sb.append(seven); break;
				case 8 : sb.append(eight); break;
				case 9 : sb.append(nine); break;
				
			}
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		System.out.print(sb);
	}
}
