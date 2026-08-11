import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int U = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> map = new TreeMap<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String name = st.nextToken();
			int price = Integer.parseInt(st.nextToken());
			map.put(price, map.getOrDefault(price, "") + name + " ");
		}
		
		int min = N;
		String winner = "";
		int price = U;
		for (int key : map.keySet()) {
			String[] temp = map.get(key).split(" ");
			
			if(temp.length < min) {
				min = temp.length;
				winner = temp[0];
				price = key;
			} else if(temp.length == min) {
				
				if(price > key) {
					winner = temp[0];
					price = key;
				}
			}
			
		}
		
		System.out.print(winner + " " + price);
		
	}
}
