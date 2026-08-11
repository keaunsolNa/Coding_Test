import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int beforeSale = 0;
		
		Integer[] burger = new Integer[B];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i++) {
			int temp = Integer.parseInt(st.nextToken());
			burger[i] = temp;
			beforeSale += temp;
		}
		
		Integer[] cide = new Integer[C];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < C; i++) {
			int temp = Integer.parseInt(st.nextToken());
			cide[i] = temp;
			beforeSale += temp;
		}
		
		Integer[] drink = new Integer[D];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < D; i++) {
			int temp = Integer.parseInt(st.nextToken());
			drink[i] = temp;
			beforeSale += temp;
		}
		
		System.out.println(beforeSale);
		Arrays.sort(burger, Collections.reverseOrder());
		Arrays.sort(cide, Collections.reverseOrder());
		Arrays.sort(drink, Collections.reverseOrder());
		
		int min = Math.min(Math.min(burger.length, cide.length), drink.length);
		
		int afterSale = 0;
		
		for(int i = 0; i < min; i++) afterSale += (burger[i] + cide[i] + drink[i]) * 0.9;
		for(int i = min; i < burger.length; i++) afterSale += burger[i];
		for(int i = min; i < cide.length; i++) afterSale += cide[i];
		for(int i = min; i < drink.length; i++) afterSale += drink[i];
		
		System.out.println(afterSale);
	}
}
