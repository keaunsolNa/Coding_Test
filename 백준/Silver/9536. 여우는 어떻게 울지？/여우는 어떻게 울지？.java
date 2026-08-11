import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			ArrayList<String> list = new ArrayList<>();
			String[] say = br.readLine().split(" ");
			
			for(int i = 0; i < say.length; i++) list.add(say[i]);
			
			String input = "";
			
			ArrayList<String> remove = new ArrayList<>();
			while(!(input = br.readLine()).equals("what does the fox say?")) {
				
				String saying = input.split(" ")[2];
				remove.add(saying);
				
			}
			
			list.removeAll(remove);
	
			for (String string : list) System.out.print(string + " ");
		}
		
	}
}
