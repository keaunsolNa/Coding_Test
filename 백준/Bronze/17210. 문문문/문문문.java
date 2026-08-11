import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
	    if (N > 5) System.out.println("Love is open door");
	    else {
	    	for(int i = 1; i < N; i ++) {
	    		K = 1 - K;
	    		System.out.println(K);
	    	}
	    }
	}
}
