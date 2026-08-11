import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int y1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());
		int y2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int x3 = Integer.parseInt(st.nextToken());
		int y3 = Integer.parseInt(st.nextToken());
		int x4 = Integer.parseInt(st.nextToken());
		int y4 = Integer.parseInt(st.nextToken());
		
		if(x2 < x3 || x1 > x4 || y1 < y4 || y2 > y3) System.out.println(0);
	    
	    else {
	    	long lx = Math.max(x1, x3);
	    	long rx = Math.min(x2, x4);
	    	long ry = Math.max(y2, y4);
	    	long ly = Math.min(y1, y3);
	    	
	    	long width = rx - lx;
	    	long height = ry - ly;
	    	
	    	System.out.println(Math.abs(width * height));
	    }
		
	}
}
