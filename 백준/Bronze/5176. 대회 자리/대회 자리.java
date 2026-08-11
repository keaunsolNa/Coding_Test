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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			Map<Integer, Boolean> map = new HashMap<>();
			int P = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] arr = new int[P];
			for(int i = 0; i < P; i++) arr[i] = Integer.parseInt(br.readLine());
			for(int i = 1; i <= M; i++) map.put(i, false);
			
			int cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				if(map.get(arr[i]) == false) map.put(arr[i], true);
				else cnt++;
			}
				
			System.out.println(cnt);
		}
	}
}
