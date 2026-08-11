import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Case = Integer.parseInt(st.nextToken());
        String text = st.nextToken();
        String carmel = "";
        String snake = "";
        String pascal = "";
        
        switch(Case) {
        	case 1 : 
        		sb.append(text);
        		sb.append("\n");
        		
        		for(int i = 0; i < text.length(); i++) {
        			
        			if(text.charAt(i) < 97) {
        				snake += "_";
        				snake += (char)(((int)text.charAt(i)) + 32);
        			} else {
        				snake += text.charAt(i);
        			}
        		}
        		
        		sb.append(snake);
        		sb.append("\n");
        		
        		pascal += (char)(((int)text.charAt(0)) - 32);
        		pascal += text.substring(1, text.length());
        		sb.append(pascal);
        		break;
        		
        	case 2 : 
        		
        		for(int i = 0; i < text.length(); i++) {
        			
        			if(text.charAt(i) == '_') {
        				i++;
        				carmel += (char)(((int)text.charAt(i)) - 32);
        			} else {
        				carmel += text.charAt(i);
        			}
        		}
        		
        		sb.append(carmel);
        		sb.append("\n");
        		
        		sb.append(text);
        		sb.append("\n");
        		
        		pascal += (char)(((int)text.charAt(0)) - 32);
        		for(int i = 1; i < text.length(); i++) {
        			
        			if(text.charAt(i) == '_') {
        				i++;
        				pascal += (char)(((int)text.charAt(i)) - 32);
        			} else {
        				pascal += text.charAt(i);
        			}
        		}
        		
        		sb.append(pascal);
        		break;
        	case 3 :

        		carmel += (char)(((int)text.charAt(0)) + 32);
        		carmel += text.substring(1, text.length());
        		sb.append(carmel);
        		sb.append("\n");
        		
        		snake += (char)(((int)text.charAt(0)) + 32);
        		for(int i = 1; i < text.length(); i++) {
        			
        			if((int)text.charAt(i) < 97) {
        				snake += "_";
        				snake += (char)(((int)text.charAt(i)) + 32);
        			} else {
        				snake += text.charAt(i);
        			}
        		}
        		sb.append(snake);
        		sb.append("\n");
        		
        		sb.append(text);
        		break;
        }
        
        System.out.println(sb);

	}
}
