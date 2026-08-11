import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int T = Integer.parseInt(br.readLine());
        
        while(T --> 0) {
        	
            char [] word = br.readLine().toCharArray();
            int index= - 1; 
            int index2 = 0;
            char temp;
        
            for(int j = word.length - 1; j > 0; j--) {
                if(word[j - 1] < word[j]) {
                	index = j - 1; 
                	break;
                }
            }
            
            if(index == -1) {
            	for(int j = 0; j < word.length; j++) sb.append(word[j]);
            	sb.append("\n");
            }
            
            else {
            	
                for(int j = word.length - 1; j >= 0; j--) {
                    if(word[index] < word[j]) {
                        index2 = j; 
                        break;
                    }
                }
                
                temp = word[index];
                word[index] = word[index2];
                word[index2] = temp;
                
                Arrays.sort(word, index+1, word.length);
                
                for(int j = 0; j < word.length; j++) sb.append(word[j]);
                
                sb.append("\n");
            }
            
        }
        System.out.print(sb);
	}
}
