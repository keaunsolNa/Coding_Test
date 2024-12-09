import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

	public static class Point implements Comparable<Point> {
		
		private int x;
		private int y;
		private int dis;
		
		public Point(int x, int y, int dis)
		{
			this.x = x;
			this.y = y;
			this.dis = dis;
		}

		public int compareTo(Main.Point o) {
			return Integer.compare(o.dis, this.dis);
		}
		
	}
	
	private static PriorityQueue<Point> pq;
	private static int x0, y0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
       
        x0 = 0;
        y0 = 0;
        
        pq = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	int dis = (Math.abs(x0 - x) * Math.abs(x0 - x)) + (Math.abs(y0 - y) * Math.abs(y0 - y));
        	pq.add(new Point(x, y, dis));
        }
        
        Point first = pq.poll();
        x0 = first.x;
        y0 = first.y;
        int ans = first.dis;
        
        sortPQ();
        
        for (int i = 0; i < m; i++)
        {
        	       	
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	int dis = (Math.abs(x0 - x) * Math.abs(x0 - x)) + (Math.abs(y0 - y) * Math.abs(y0 - y));
        	
        	pq.add(new Point(x, y, dis));

        	if (i < m - 1)
        	{
        		sortPQ();
        		Point target = pq.poll();
        		x0 = target.x;
        		y0 = target.y;
        		ans += target.dis;
        	}
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
   
    }

    private static void sortPQ()
    {
    	PriorityQueue<Point> newPQ = new PriorityQueue<>();
    	
        while (!pq.isEmpty())
        {
        	Point p = pq.poll();
        	int dis = (Math.abs(x0 - p.x) * Math.abs(x0 - p.x)) + (Math.abs(y0 - p.y) * Math.abs(y0 - p.y));
        	newPQ.add(new Point(p.x, p.y, dis));
        }
        
        pq = newPQ;
    }
}
