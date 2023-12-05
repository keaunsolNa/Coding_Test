import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] answer = new int[2];
        int min = Integer.MAX_VALUE;
        while(N --> 0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	if(y < min) { 
        		min = y;
        		answer[0] = x;
        		answer[1] = y;
        	}
        }
        
        System.out.println(answer[0] + " " + answer[1]);
	}
}
