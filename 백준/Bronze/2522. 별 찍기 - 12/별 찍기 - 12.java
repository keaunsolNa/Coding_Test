import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int star = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= star; i++) {
        	
            for (int j = star - i; j > 0; j--) {
            	System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
            	System.out.print("*");
            }
            
            System.out.println();
            
        }
        
        for (int i = 1; i <= star-1; i++) {
        	
            for (int j = 1; j <= i; j++) {
            	System.out.print(" ");
            }
            
            for (int j = 1; j <= star-i; j++) {
            	System.out.print("*");
            }
            
            System.out.println();
            
        }
		
	}
}
