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
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        
        List<Integer> arr = new ArrayList<>();
        arr.add(A);
        arr.add(B);
        
        int idx = 1;
        while(true) {
        	
        	arr.add(arr.get(idx - 1) - arr.get(idx));
        	idx++;
        	
        	if(arr.get(idx - 1) < arr.get(idx)) break;
        	
        }
        
        System.out.println(arr.size());
	}	
}
