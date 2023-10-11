import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    	private static class Point implements Comparable<Point> {
		
		int idx;
		int basepoint;
		int upPoint;
		
		Point(int idx, int basePoint, int upPoint) {
			this.idx = idx;
			this.basepoint = basePoint;
			this.upPoint = upPoint;
		}

		@Override
		public int compareTo(Point o) {
			
			return Math.min(100	- o.basepoint, o.upPoint) - Math.min(100 - this.basepoint, this.upPoint);
		}
		
		
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int totalTime = N * 24;
		
		int[] basePoint = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) basePoint[i] = Integer.parseInt(st.nextToken());
		
		int[] upPoint = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) upPoint[i] = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Point> pq = new PriorityQueue<>();
		for(int i = 0; i < M; i++) pq.add(new Point(i, basePoint[i], upPoint[i]));

		while(!pq.isEmpty()) {
			
			Point p = pq.poll();
			p.basepoint += p.upPoint;
			
			if(p.basepoint < 100) pq.add(p);
			else basePoint[p.idx] = 100;
			totalTime--;
			
			if(totalTime == 0) {
				while(!pq.isEmpty()) {
					Point pp = pq.poll();
					basePoint[pp.idx] = pp.basepoint;
				}
				break;
			}
			
		}
		
		int total = 0;
		for (int point : basePoint) total += point > 100 ? 100 : point;
			
		System.out.println(total);
   }
}