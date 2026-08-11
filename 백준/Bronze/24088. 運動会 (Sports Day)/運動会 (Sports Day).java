import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        String input = br.readLine();
        
        long RA = countChar(input, 'R');
        long KA = countChar(input, 'W');
    
        if(RA == K) System.out.println("W");
        else System.out.println("R");
		
	}

	public static long countChar(String str, char ch) {
		return str.chars()
				  .filter(c -> c == ch)
				  .count();
	}
}
