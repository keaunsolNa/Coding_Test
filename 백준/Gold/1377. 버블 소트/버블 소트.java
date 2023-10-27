import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static class Point implements Comparable<Point> {
		
		int num;
		int idx;

		public Point(int num, int idx) {
			this.num = num;
			this.idx = idx;
		}
		
		@Override
		public int compareTo(Point o) {
			return num - o.num;
		}
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		Point[] points = new Point[N + 1];
		
		for(int i = 1; i <= N; i++) points[i] = new Point(Integer.parseInt(br.readLine()), i);
		Arrays.sort(points, 1, N + 1);
		
		int max = 0;
		for(int i = 1; i <= N; i++) max = Math.max(max, points[i].idx - i);
		
		System.out.println(max + 1);
   }
}