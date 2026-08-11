import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		Map<Integer, String> map = new TreeMap<>();
		for(int i = 0; i < 8; i++) {
			st = new StringTokenizer(br.readLine());
			int[] inputs = Arrays.stream(st.nextToken().split(":")).map(String::trim).mapToInt(Integer::parseInt).toArray();
			
			int time = (inputs[0] * 60000) + (inputs[1] * 1000) + inputs[2];
			String team = st.nextToken();
			
			map.put(time, team);
		}
		
		int point = 10;
		int red = 0;
		int blue = 0;
		for (int key : map.keySet()) {
			
			if(map.get(key).equals("B")) blue += point;
			else red += point;
			
			if(point > 6) point -= 2;
			else point--;
			
		}
		
		if(red > blue) System.out.println("Red");
		else System.out.println("Blue");
	}
}
