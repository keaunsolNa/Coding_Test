import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	int number = Integer.parseInt(br.readLine());

        	int sum = 0;
        	for(int i = 1; i <= number; i++) {
        		if(number % i == 0) sum++;
        	}
        	
        	sb.append(number +" " + sum + "\n");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
	}
}
