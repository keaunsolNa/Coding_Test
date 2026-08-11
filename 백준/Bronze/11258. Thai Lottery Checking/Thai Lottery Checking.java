import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Map<String, Integer> map = new HashMap<>();
		String[] number = new String[6];
		long[] money = new long[6];
		for(int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			
			number[i] = st.nextToken();
			money[i] = Long.parseLong(st.nextToken());
			
		}
		
		String input = "0";
		
		while(!(input = br.readLine()).equals("-1")) {
			
			long price = 0;
			
			String front = input.substring(0, 3);
			String back = input.substring(3, 6);
			String back2 = input.substring(4, 6);
			
			if(number[0].equals(input)) price += money[0];
			if(number[1].equals(front)) price += money[1];
			if(number[2].equals(front)) price += money[2];
			if(number[3].equals(back)) price += money[3];
			if(number[4].equals(back)) price += money[4];
			if(number[5].equals(back2)) price += money[5];
			
			sb.append(price + "\n");
		}
		
		System.out.print(sb);
	}
}
