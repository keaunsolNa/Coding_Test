import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	static Integer[] point;
	static int stair[];

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		point = new Integer[T + 1];
		
		stair = new int[T + 1];
		for(int i = 1; i <= T; i++) stair[i] = Integer.parseInt(br.readLine());
		
		point[0] = stair[0];
		point[1] = stair[1];
		
		if(T >= 2) {
			point[2] = stair[1] + stair[2];
		}
		System.out.println(totalStair(T));
		
	}

	public static int totalStair(int n) {
		
		if(point[n] == null) {
			point[n] = Math.max(totalStair(n-2), totalStair(n-3) + stair[n-1]) + stair[n];
		}
		
		return point[n];
	}
}
