import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static class Point {
		int x;
		int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static List<Point> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			list.add(new Point(x, y));
			
		}
		
		int sum = 0;
		for(int i = 0; i < N - 1; i++) sum += distanceHap(i, i + 1);

		int result = sum;
		for(int i = 1; i < N - 1; i++) {
			int loop = sum - (distanceHap(i, i + 1) + distanceHap(i, i - 1)) + distanceHap(i - 1, i + 1);
			
			result = Math.min(loop, result);
		}

		System.out.println(result);
	} 

    public static int distanceHap(int first, int second) {
        return Math.abs(list.get(first).x - list.get(second).x) + Math.abs(list.get(first).y - list.get(second).y);
    }

}