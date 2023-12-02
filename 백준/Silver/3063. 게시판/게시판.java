import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int x3 = Integer.parseInt(st.nextToken());
			int y3 = Integer.parseInt(st.nextToken());
			int x4 = Integer.parseInt(st.nextToken());
			int y4 = Integer.parseInt(st.nextToken());
			
			int range = (x2 - x1) * (y2 - y1);
			if(x2 < x3 || x1 > x4 || y2 < y3 || y1 > y4) System.out.println(range);
			else {
				
				int leftX = Math.max(x1, x3);
				int leftY = Math.max(y1, y3);
				int rightX = Math.min(x2, x4);
				int rightY = Math.min(y2, y4);

				int width = rightX - leftX;
				int height = rightY - leftY;
				
				System.out.println(range - (width * height));
			}
		}
	}
}
