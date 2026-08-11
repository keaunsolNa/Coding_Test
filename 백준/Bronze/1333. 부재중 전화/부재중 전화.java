import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<Boolean> sec = new ArrayList<Boolean>();
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < L; j++) { 
                sec.add(true);
            }
            
            if(i != N-1) { 
                for(int j = 0; j < 5; j++) {   
                    sec.add(false);
                }
            }
        }
        
        int result = 0;
        
        while(result < sec.size())  {
        	
            if(sec.get(result) == false) {
                break;
            }
            result += D;    
        }
	
        System.out.println(result);
	}
}
