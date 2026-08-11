import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String input = "";
		
		while(!(input = br.readLine()).equals("#")) {
			st = new StringTokenizer(input);
			
			int Cheryl = 0;
			int Tania = 0;
			
			String temp = "";
			
			while(!(temp = st.nextToken()).equals("*")) {
				
				if(temp.equals("A")) {
					Cheryl++;
				} else {
					int plus = Integer.parseInt(temp);
					if(plus % 2 == 0) Tania++;
					else Cheryl++;
				}
			}
			
			if(Cheryl > Tania) System.out.println("Cheryl");
			else if(Cheryl < Tania) System.out.println("Tania");
			else System.out.println("Draw");
		}
	}
}
