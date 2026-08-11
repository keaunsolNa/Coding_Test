import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			int[][] mission = new int[M][3];
			
			for(int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				mission[j][0] = Integer.parseInt(st.nextToken());
				mission[j][1] = Integer.parseInt(st.nextToken());
				mission[j][2] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			int A = Integer.parseInt(st.nextToken());
			
			BigInteger totalMoney = new BigInteger("0");
			for(int j = 0; j < M; j++) {
				double temp = (mission[j][0] * K) - (mission[j][1] * D) + (mission[j][2] * A);
				
				if(temp > 0) {
					BigInteger money = new BigInteger((temp+"").split("[.]")[0]);
					totalMoney = totalMoney.add(money);
				}
			}
			
			System.out.println(totalMoney);
		}
		
		
	}
}
