import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int T = Integer.parseInt(br.readLine());
        
        for(int k = 0; k  <T; k++){
            st = new StringTokenizer(br.readLine());
            int candy = Integer.parseInt(st.nextToken());
            int box = Integer.parseInt(st.nextToken());
            int boxSize[] = new int [box];
            
            for(int i = 0; i < box; i++) {
                st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                boxSize[i] = num1 * num2;
            }

            Arrays.sort(boxSize);
            int answer = 0;
            
            for(int i = box-1; i > -1; i--) {
                answer++;
                candy-= boxSize[i];
                if(candy < 1) {
                    break;
                }
            }


            sb.append(answer);
            sb.append("\n"); 
        }
        
        System.out.println(sb);
	}
}
