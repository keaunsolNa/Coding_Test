import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		Map<java.util.Date, String> map = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			
			String[] input = br.readLine().split(" ");
			
			String name = input[0];
			String date = "";
			int dd = Integer.parseInt(input[1]);
			int mm = Integer.parseInt(input[2]);
			int yyyy = Integer.parseInt(input[3]);
			
			date += yyyy;
			if(mm < 10) date += "0" + mm;
			else date += "" + mm;
			
			if(dd < 10) date += "0" + mm;
			else date += "" + dd;
			
			SimpleDateFormat dtFormat = new SimpleDateFormat("yyyyMMdd");
			try {
				Date formatDate = dtFormat.parse(date);
				map.put(formatDate, name);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
		
		int idx = 1;
		
		for (java.util.Date key : map.keySet()) {
			
			if(idx == 1) sb.append(map.get(key));
			else if(idx == map.size()) sb.insert(0, map.get(key) + "\n");
			
			idx++;
		}
		
		System.out.print(sb);
	}
}
