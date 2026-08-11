import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		if(m == 0) {
			System.out.println(0);
		} else {
			conversion(m, n);
		}
	}

    public static void conversion(int number, int N){
        StringBuilder sb = new StringBuilder();
	    int current = number;
	    
        while(current > 0) {
            if(current % N < 10){

            	sb.append(current % N);
                
            } else {
            	
                sb.append((char)(current % N - 10 + 'A'));
                
            }
            current /= N;
        }
        System.out.println(sb.reverse());
    }
}
