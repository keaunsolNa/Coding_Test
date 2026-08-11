import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		Map<String, List<String>> mentoAndMenti = new TreeMap<>();
		
		for(int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			String mento = input[0];
			String menti = input[1];
			if(mentoAndMenti.containsKey(mento)) {
				
				mentoAndMenti.get(mento).add(menti);
				
			} else {
				
				List<String> mentiList = new ArrayList<>();
				mentiList.add(menti);
				mentoAndMenti.put(mento, mentiList);
				
			}
			
		}
		StringBuilder sb = new StringBuilder();
		for (String mento : mentoAndMenti.keySet()) {
			
			Collections.sort(mentoAndMenti.get(mento), Collections.reverseOrder());
			
			for(int i = 0; i < mentoAndMenti.get(mento).size(); i++) {
				sb.append(mento).append(" ").append(mentoAndMenti.get(mento).get(i)).append("\n");
			}
		}
		
		sb.deleteCharAt(sb.length()-1);
		System.out.print(sb);
	}
}
