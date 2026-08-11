import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int ml;
        int mr;
        int tl;
        int tr;
        
        String[] inputs = br.readLine().split(" ");
        
        ml = "SPR".indexOf(inputs[0]);
        mr = "SPR".indexOf(inputs[1]);
        tl = "SPR".indexOf(inputs[2]);
        tr = "SPR".indexOf(inputs[3]);
        
        if (ml == mr && ((ml + 2) % 3 == tl || (ml + 2) % 3 == tr)) {
        	
            System.out.println("TK");
            
        } else if (tl == tr && ((tl + 2) % 3 == ml || (tl + 2) % 3 == mr)) {
        	
            System.out.println("MS");
            
        } else {
        	
            System.out.println("?");
            
        }
	}
}
