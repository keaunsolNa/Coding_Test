import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		
		while(t --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int R = A * (((r + 1) * (r + 1)) + (g * g) + (b * b)) + C *(Math.min(r + 1, Math.min(g, b)));
			int G = A * ((r * r) + ((g + 1) * (g + 1)) + (b * b)) + C *(Math.min(r, Math.min(g + 1, b)));
			int B = A * ((r * r) + (g * g) + ((b + 1) * (b + 1))) + C *(Math.min(r, Math.min(g, b + 1)));
			
			if(Math.max(R, Math.max(G, B)) == R) System.out.println("RED");
			else if(Math.max(R, Math.max(G, B)) == B) System.out.println("BLUE");
			else System.out.println("GREEN");
		}
		
	}
}
