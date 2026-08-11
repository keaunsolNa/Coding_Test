import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        if(input.contains("_")) {
        	
        	for(int i = 0; i < input.length(); i++) {
        		boolean flag = false;
        		if((int)input.charAt(i) < 95) {
        			sb.setLength(0);
        			sb.append("Error!");
        			break;
        		} else if((int)input.charAt(i) == '_') {
        			if(i == input.length()-1) {
        				sb.setLength(0);
        				sb.append("Error!");
        				break;
        			}
        			
        			if((int)input.charAt(i+1) == '_') {
        				sb.setLength(0);
        				sb.append("Error!");
        				break;
        			}
        			
        			i++;
        			flag = true;
        		} else {
        			sb.append(input.charAt(i));
        		}
        		
        		if(flag) {
        			sb.append((char)((int)input.charAt(i) - 32));
        		}
        	}
        	
        } else {
        	
        	for(int i = 0; i < input.length(); i++) {
        		boolean flag = false;
        		
        		if(input.charAt(i) < 95) {
        			sb.append("_");
        			sb.append((char)((int)input.charAt(i) + 32));
        		} else {
        			sb.append(input.charAt(i));
        		}
        		
        	}
        }
        
        System.out.print(sb);
	}
}
