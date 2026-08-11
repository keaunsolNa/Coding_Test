import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int shipCount = Integer.parseInt(st.nextToken());
			int shipSpeed = Integer.parseInt(st.nextToken());
			int day = Integer.parseInt(st.nextToken());
			long sumDucat = 0;
			
			StringBuilder sb = new StringBuilder();
			for(int j = 0; j < shipCount; j++) {
				st = new StringTokenizer(br.readLine(), " ");
				int distance = Integer.parseInt(st.nextToken());
				int ducat = Integer.parseInt(st.nextToken());

				if(shipSpeed*day >= distance) {
					sumDucat += ducat;
				}
			}
			
			sb.append("Data Set ").append(i+1).append(":").append("\n").append(sumDucat).append("\n");
			System.out.println(sb);
		}
	}
}
