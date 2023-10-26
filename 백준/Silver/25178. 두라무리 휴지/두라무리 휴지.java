import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
		
       String input = br.readLine();
       String compare = br.readLine();
		
       int[] cnt = new int['Z' - 'A' + 1];
		
       for (int i = 0; i < N; i++) {
        	
           cnt[input.charAt(i) - 'a']++;
           cnt[compare.charAt(i) - 'a']--;
            
       }
        
       for (int i = 0; i < 'Z'-'A'+1; i++) 
           if (cnt[i] != 0) {
               System.out.println("NO");
               return;
           }
       
       char inputTarget = input.charAt(0);
       char compareTarget = compare.charAt(0);
		
       if(inputTarget != compareTarget) {
           System.out.println("NO");
           return;
       }
		
       inputTarget = input.charAt(N - 1);
       compareTarget = compare.charAt(N - 1);
		
       if(inputTarget != compareTarget) {
           System.out.println("NO");
           return;
       }
		
       input = input.replaceAll("[aeiou]", "");
       compare = compare.replaceAll("[aeiou]", "");
		
       if(!input.equals(compare)) {
           System.out.println("NO");
           return;
       }
		
       System.out.println("YES");
   }
}