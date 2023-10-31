import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Set<Character> list = new HashSet<>();
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) list.add(st.nextToken().charAt(0));

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) list.add(st.nextToken().charAt(0));
		
		int K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < K; i++) list.remove((Object)st.nextToken().charAt(0));
		
		int S = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringBuilder sb = new StringBuilder();
		boolean flag = false;
		for(int i = 0; i < S; i++) {
			
			char temp = str.charAt(i);
			if(temp == ' ' || list.contains(temp)) {
				
				if(flag) { 
					sb.append("\n"); 
					flag = false; 
				}
				continue;
			}
			
			sb.append(temp); 
			flag = true; 
			
		}
		
		if(sb.charAt(sb.length() - 1) == '\n') sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
   }
}