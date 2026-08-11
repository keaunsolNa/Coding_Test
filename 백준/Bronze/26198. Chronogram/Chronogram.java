import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Map<String, Integer> chronogram = new HashMap<>();
		
		chronogram.put("I", 1);
		chronogram.put("V", 5);
		chronogram.put("X", 10);
		chronogram.put("L", 50);
		chronogram.put("C", 100);
		chronogram.put("D", 500);
		chronogram.put("M", 1000);
		
		for(int i = 0; i < T; i++) {
			String input = br.readLine();
			
			int year = 0;
			for(int j = 0; j < input.length(); j++) {
				if(chronogram.containsKey(input.charAt(j)+"")) year += chronogram.get(input.charAt(j)+"");
					
			}
			System.out.println(year);
		}
	}
}
