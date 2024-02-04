import java.io.*;
import java.util.*;

public class Main {
	
    private static class Point {

        double x;
        double y;
        int idx;

        public Point(double x, double y, int idx) {
        	this.x = x;
        	this.y = y;
            this.idx = idx;
        }
    }
    
    private static class Edge implements Comparable<Edge> {
    	
    	int start;
    	int end;
    	double vector;
    	
    	public Edge(int start, int end, double vector) {
    		this.start = start;
    		this.end = end;
    		this.vector = vector;
    	}
    	
    	@Override
    	public int compareTo(Edge o) {
    		
    		return this.vector < o.vector ? -1 : 1;
    	}
    	
    }
    private static int[] parents;
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	Point[] points = new Point[n];
    	
    	for(int i = 0; i < n; i++) {
    		
    		st = new StringTokenizer(br.readLine());
    		points[i] = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()), i);
    		
    	}

    	PriorityQueue<Edge> pq = new PriorityQueue<>();
    	parents = new int[n + 1];
    	
    	for(int i = 0; i < n + 1; i++) parents[i] = i;
    	
    	for(int i = 0; i < n - 1; i++) 
    		for(int j = i + 1; j < n; j++) 
    			pq.add(new Edge(points[i].idx, points[j].idx, getDist(points[i], points[j])));
    	
    	double result = 0;
    	int cnt = 0;
    	
    	while(!pq.isEmpty()) {
    		
    		Edge cur = pq.poll();
    		
    		if(find(cur.start) != find(cur.end)) {
    			
    			union(cur.start, cur.end);
    			cnt++;
    			result += cur.vector;
    		}
    		
    		if(cnt == n) break;
    	}

    	System.out.printf("%.2f", result);
    	
    	
    }
    
    private static double getDist(Point p1, Point p2) {
    	
    	return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    private static int find(int x) {

        if(parents[x] == x) return x;
        return parents[x] = find(parents[x]);
        
    }

    private static void union(int x, int y) {

        x = find(x);
        y = find(y);

        if(x < y) {

        	int tmp = x;
            x = y;
            y = tmp;
        }

        parents[y] = x;
    }
}
