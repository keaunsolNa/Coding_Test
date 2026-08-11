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
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cash = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] stock = new int[14];
		
		for(int i = 0; i < 14; i++) {
			stock[i] = Integer.parseInt(st.nextToken());
		}
		
		int jAmount = 0;
		int sAmount = 0;
		int jCash = cash;
		int sCash = cash;
		for(int i = 0; i < stock.length; i++) {
			jAmount += jCash/stock[i];
			jCash = jCash%stock[i];
		}
		
		for(int i = 3; i < stock.length; i++) {
			if(stock[i-3] < stock[i-2] && stock[i-2] < stock[i-1] && stock[i-1] < stock[i]) {
				sCash = sAmount*stock[i] + sCash;
				sAmount = 0;
			}
			
			if(stock[i-3] > stock[i-2] && stock[i-2] > stock[i-1] && stock[i-1] > stock[i]) {
				sAmount += sCash/stock[i];
				sCash = sCash%stock[i];
			}
		}
		
		if(jCash + jAmount*stock[13] > sCash + (sAmount*stock[13])) {
			System.out.println("BNP");
		} else if(jCash + jAmount*stock[13] < sCash + (sAmount*stock[13])) {
			System.out.println("TIMING");
		} else {
			System.out.println("SAMESAME");
		}
	}
}
