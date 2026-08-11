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
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int i, j, n = Integer.parseInt(br.readLine());
		ArrayList<BigInteger> list = new ArrayList<>();
		String line[];
		
		for(i = 0; i < n; i++) {
			line = br.readLine().split("\\D");
			
			for(j = 0; j < line.length; j++)
				if(!line[j].equals("")) list.add(new BigInteger(line[j]));
			
		}
		
		list.sort(null);
		n = list.size();
		for(i = 0; i < n; i++) sb.append(list.get(i) + "\n");
		
		System.out.println(sb.toString());
		
	}
}
