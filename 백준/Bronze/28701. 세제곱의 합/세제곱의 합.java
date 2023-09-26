import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
	   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        long sum = 0;
        for(int i = 1; i <= input; i++) {
            sum += i;
        }
        
        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(sum * sum);
	}

}
