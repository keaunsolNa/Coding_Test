import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder out = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	for (int i = 0; i < n; i++) {
    		
    		String teamName = br.readLine();
    		if (teamName.length() > 10) continue;
    		if (teamName.matches("^[0-9]*$")) continue;

    		int upperCount = 0;
    		int lowerCount = 0;

    		for (int j = 0; j < teamName.length(); j++) {
    			char c = teamName.charAt(j);
    			if (Character.isLowerCase(c)) lowerCount++;
    			else if (Character.isUpperCase(c)) upperCount++;
    		}

    		if (upperCount <= lowerCount) {
    			
    			System.out.println(teamName);
    			break;
    		}
		}


    }
}
