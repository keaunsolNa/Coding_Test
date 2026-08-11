import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int answer = 0;
        int min = Integer.MAX_VALUE;
        
        while (n--> 0) {
            int temp = Integer.parseInt(st.nextToken());
            answer = Math.max(answer, temp - min);
            min = Math.min(min, temp);
        }
        
        System.out.println(answer);
	}
}
