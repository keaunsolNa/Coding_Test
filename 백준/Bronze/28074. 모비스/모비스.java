import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		if(countChar(input, 'M') > 0 && countChar(input, 'O') > 0 && countChar(input, 'B') > 0 && countChar(input, 'I') > 0 && countChar(input, 'S') > 0){ 
			System.out.println("YES");  
		}
		
		else System.out.println("NO");
			
	}

   public static long countChar(String str, char ch) {
       return str.chars()
               .filter(c -> c == ch)
               .count();
   }
}
