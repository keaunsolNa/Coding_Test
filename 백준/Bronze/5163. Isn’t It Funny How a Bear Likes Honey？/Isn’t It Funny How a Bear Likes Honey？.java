import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		final double pi = 3.14159265359;
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 1; i <= T; i++){
	    	
	        st = new StringTokenizer(br.readLine());
	        double b = Double.parseDouble(st.nextToken());
	        double w = Double.parseDouble(st.nextToken());
	        double tH = 0;
	    
	        for(int j = 1; j <= b; j++) {
	        	
	        	double radius = Double.parseDouble(br.readLine());
	        	tH += 4.0 / 3.0 * pi * Math.pow(radius, 3) / 1000;

	        }
	        
	        System.out.printf("Data Set %d:\n", i);
	        if(tH >= w)  System.out.println("Yes");
	        else System.out.println("No");
	        System.out.println();
	    }
	}
}
