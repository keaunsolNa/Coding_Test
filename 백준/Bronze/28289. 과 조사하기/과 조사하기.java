import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int P = Integer.parseInt(br.readLine());
        
        int one = 0;
        int two = 0;
        int thr = 0;
        int fou = 0;
        for(int i = 0; i < P; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());		            
            
            int G = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            
            if(G == 1) fou++;
            else if(C == 1 || C == 2) one++;
            else if(C == 3) two++;
            else if(C == 4) thr++;
        }
        
        System.out.println(one);
        System.out.println(two);
        System.out.println(thr); 
        System.out.println(fou);        
    }
}
