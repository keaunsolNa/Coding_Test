package baekjoon_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class StringPlus21 {
	
	public static void main(String[] args) throws IOException {
		test07();
	}

	
	// DNA
	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); 
        int m = Integer.parseInt(st.nextToken()); 
        int[][] alphabet = new int[m][26];
        StringBuilder sb = new StringBuilder();
        int hammingDistance = 0;
        String[] dnas = new String[n];
        
        for (int i = 0; i < n; i++) {
        	
            dnas[i] = br.readLine();
            for (int j = 0; j < m; j++)  alphabet[j][dnas[i].charAt(j) - 'A'] += 1;
            
        }

        for (int i = 0; i < m; i++) {
        	
            int max = alphabet[i][0];
            char target = 'A';
            
            for (int j = 0; j < 26; j++) {
            	
                if (alphabet[i][j] > max) {
                	
                    max = alphabet[i][j];
                    target = (char) (j + 'A');
                }
            }
            sb.append(target);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) if (dnas[i].charAt(j) != sb.charAt(j)) hammingDistance++;
        }

        System.out.println(sb.toString());
        System.out.println(hammingDistance);
		
	}
	
	
}
