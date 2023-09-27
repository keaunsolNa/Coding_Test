import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	int N = Integer.parseInt(br.readLine());
        	
        	if(N > 4500) System.out.println("Case #" + (i + 1) +": Round 1");
        	else if(N > 1000) System.out.println("Case #" + (i + 1) +": Round 2");
        	else if(N > 25) System.out.println("Case #" + (i + 1) +": Round 3");
        	else System.out.println("Case #" + (i + 1) +": World Finals");
        }
	}

}
