import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int J = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
        
        	int total = 0;
        	String input = br.readLine();
        	
        	for(int j = 0; j < input.length(); j++) {
        		
        		if((int)input.charAt(j) == 32) total += 1;
        		else if((int)input.charAt(j) >= 49 && (int)input.charAt(j) <= 57) total += 2;
        		else if((int)input.charAt(j) >= 65 && (int)input.charAt(j) <= 90) total += 4;
        		else total += 2;
        	}
        	
        	if(total <= J) answer++;
        }
	
        System.out.println(answer);
   }
}