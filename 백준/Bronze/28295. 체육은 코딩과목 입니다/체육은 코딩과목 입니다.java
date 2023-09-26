import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char direction = 'N';
        for(int i = 0; i < 10; i++) {
        	
        	int N = Integer.parseInt(br.readLine());
            
        	switch (N) {
			case 1:
				direction = direction == 'N' ? 'E' : direction == 'E' ? 'S' : direction == 'S' ? 'W' : 'N';
				break;

			case 2:
				direction = direction == 'N' ? 'S' : direction == 'E' ? 'W' : direction == 'S' ? 'N' : 'E';
				break;
				
			case 3:
				direction = direction == 'N' ? 'W' : direction == 'E' ? 'N' : direction == 'S' ? 'E' : 'S';
				break;
				
			}
        }
        
        System.out.println(direction);
	}

}
