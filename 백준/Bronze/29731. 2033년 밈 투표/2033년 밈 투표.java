import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();
		list.add("Never");
		list.add("gonna");
		list.add("give");
		list.add("you");
		list.add("up");
		list.add("let");
		list.add("down");
		list.add("run");
		list.add("around");
		list.add("and");
		list.add("desert");
		list.add("make");
		list.add("cry");
		list.add("say");
		list.add("goodbye");
		list.add("tell");
		list.add("a");
		list.add("lie");
		list.add("hurt");
		list.add("stop");
		
		
		for(int i = 0; i < N; i++) {
		
			st = new StringTokenizer(br.readLine());
			
			while(st.hasMoreTokens()) {

				if(!list.contains(st.nextToken())) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");
   }
}