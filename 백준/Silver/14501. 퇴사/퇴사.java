import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	private static int N;
	private static int day[];
	private static int money[];
	private static int maxMoney;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		day = new int[N];
		money = new int[N];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			day[i] = Integer.parseInt(st.nextToken());
			money[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, 0);
		
		System.out.println(maxMoney);
	}

	public static void dfs(int i, int totalMoney) {

		if(i >= N) {
			if(maxMoney < totalMoney) maxMoney = totalMoney;
			return;
		}
		
		if(i + day[i] <= N) dfs(i + day[i], totalMoney + money[i]);
		
		
		if(i + 1 <= N) dfs(i + 1, totalMoney);
		
		
	}
}
