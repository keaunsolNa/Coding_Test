import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = 1;
		while(true) {
			
			st = new StringTokenizer(br.readLine());
			
			double o = Integer.parseInt(st.nextToken());
			double w = Integer.parseInt(st.nextToken());
			String emotion = "";
			
			if(o == 0 && w == 0) break;
			
			while(true) {
				
				st = new StringTokenizer(br.readLine());
				
				char order = st.nextToken().charAt(0);
				int input = Integer.parseInt(st.nextToken());
				
				if(order == '#' && input == 0) break;
				
				if(w > 0) {
					if(order == 'E') w -= input;
					else if(order =='F') w += input;
				}
				
			}
			
			if(w < (o * 2) && w > (o * 0.5)) emotion = " :-)";
			else if (w <= 0) emotion =" RIP";
			else emotion = " :-(";
			
			
			sb.append(t + emotion + "\n");
			t++;
		}
		
		System.out.println(sb);
		
	}
}
