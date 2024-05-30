import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        
        while (n --> 0) {
        	
        	String str = br.readLine();
        	sb.append("The longest decreasing suffix of ").append(str).append(" is ");
        	
        	StringBuilder ans = new StringBuilder(str.charAt(str.length() - 1) + "");
        	for(int i = str.length() - 1; i > 0; i--) {

        		if (str.charAt(i) - 'a' < str.charAt(i - 1) - 'a') {
        			ans.append(str.charAt(i - 1));
        		}
        		else break;
        		
        	}
        	
        	sb.append(ans.reverse()).append("\n");
        }

        System.out.println(sb);
    }

}