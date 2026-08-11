import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int[] a = new int[N];
        int res = 0;
        int x = 0;

        for (int i = 0; i < N; i++) {
        	
            a[i] = Integer.parseInt(input[i]);
            
            if(a[i] == x + 1) x = a[i];
            else res++;
            
        }

        System.out.println(res);
		
	}
}
