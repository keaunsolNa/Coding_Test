import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        
        while(!(input = br.readLine()).equals("#")) {
        	String[] text = input.split(" ");
        	
        	
        	for(int i = 0; i < text.length; i++) {
        		
        		if(text[i].length() > 2) {
        			
	        		sb.append(text[i].charAt(0));
	    			sb.append(new StringBuilder(String.valueOf(text[i].substring(1, text[i].length()-1))).reverse().toString());
	    			sb.append(text[i].charAt(text[i].length()-1));
	    			sb.append(" ");
        		} else {
        			sb.append(text[i]);
        			sb.append(" ");
        		}
        	}
        	sb.deleteCharAt(sb.length()-1);
        	sb.append("\n");
        }
     
        sb.deleteCharAt(sb.length()-1);
        System.out.print(sb);
	}
}
