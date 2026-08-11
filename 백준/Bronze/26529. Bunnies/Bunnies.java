import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		long[] pibbo = new long[46];
		pibbo[0] = 1;
		pibbo[1] = 1;
		
		for(int i = 2; i <= 45; i++) pibbo[i] = pibbo[i - 1] + pibbo[i - 2];
		
		
		while(T --> 0) System.out.println(pibbo[Integer.parseInt(br.readLine())]);
		
	}
}
