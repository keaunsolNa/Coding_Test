import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			long a = Integer.parseInt(st.nextToken());
			long b = Integer.parseInt(st.nextToken());
			int A = (int)a;
			int B = (int)b;
			
			if(a == 0 && b == 0) break;
			List<Long> arr1 = new ArrayList<>();
			List<Long> arr2 = new ArrayList<>();
			
			arr1.add(a);
			arr2.add(b);
			
			while(a != 1) {
				a = a % 2 == 0 ? a / 2 : a * 3 + 1;
				arr1.add(a);
			}
			
			while(b != 1) {
				b = b % 2 == 0 ? b / 2 : b * 3 + 1;
				arr2.add(b);
			}
			
			long SA = 0;
			long SB = 0;
			long C = 0;
			for(int i = 0; i < arr1.size(); i++) {
				
				if(arr2.contains(arr1.get(i))) {
					SA = i;
					SB = arr2.indexOf(arr1.get(i));
					C = arr1.get(i);
					break;
				}
			}
			
			sb.append(A +" needs " + SA + " steps, " + B + " needs " + SB + " steps, they meet at " + C);
			sb.append("\n");
		}

		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
		
	}
}
