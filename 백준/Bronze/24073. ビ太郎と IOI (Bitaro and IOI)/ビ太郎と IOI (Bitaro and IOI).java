import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        boolean firstI = false;
        boolean O = false;
        boolean lastI = false;
        
        for(int i = 0; i < N; i++) {
        	if(input.charAt(i) == 'I') firstI = true;
        	
        	if(firstI) if(input.charAt(i) == 'O') O = true;
        	
        	if(firstI && O) if(input.charAt(i) == 'I') {
        		System.out.println("Yes");
        		return;
        	}
        }
        
        System.out.println("No");
	}
}
