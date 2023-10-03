import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(int i = 0; i < N; i++) {
            
            String S = br.readLine();
            if(S.contains("01") || S.contains("OI")) answer++;
            
        }
        
        System.out.println(answer);
	}
    
}
