import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
        int[] numCount = new int[10];
        long total = 0;
        
        for(int i = 0; i < input.length(); i++) {
            int temp = Integer.parseInt(input.substring(i, i+1));
            numCount[temp] += 1;
            total += temp;
        }
        
        
        if(!input.contains("0") || total % 3 != 0) {
        	System.out.println(-1);
        	return;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--) {
            while(numCount[i] > 0) {
                sb.append(i);
                numCount[i]--;
            }
        }
		
        System.out.println(sb.toString());
		
	}
}
