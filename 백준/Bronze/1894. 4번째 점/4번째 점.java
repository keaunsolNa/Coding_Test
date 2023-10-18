import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static class Point {
	    double x, y;

	    public Point(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public Point add(Point other) {
	        return new Point(this.x + other.x, this.y + other.y);
	    }

	    public Point subtract(Point other) {
	        return new Point(this.x - other.x, this.y - other.y);
	    }

	    public boolean equals(Point other) {
	        return this.x == other.x && this.y == other.y;
	    }

	}
	
    
   public static void main(String[] args) throws IOException {
		
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       String input;
		
       while((input = br.readLine()) != null) {
			
			st = new StringTokenizer(input);
			Point a = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
			Point b = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
			Point c = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
			Point d = new Point(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));

			Point answer = new Point(0, 0);
            if (a.equals(c)) answer = d.add(b.subtract(a));
            if (a.equals(d)) answer = c.add(b.subtract(a));
            if (b.equals(c)) answer = d.add(a.subtract(b));
            if (b.equals(d)) answer = c.add(a.subtract(b));

            System.out.printf("%.3f %.3f%n", answer.x, answer.y);
        }
   }
}