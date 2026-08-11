import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		switch(month) {
			case 2 : day += 31; break;
			case 3 : day += 59; break;
			case 4 : day += 90; break;
			case 5 : day += 120; break;
			case 6 : day += 151; break;
			case 7 : day += 181; break;
			case 8 : day += 212; break;
			case 9 : day += 243; break;
			case 10 : day += 273; break;
			case 11 : day += 304; break;
			case 12 : day += 334; break;
		}
		
		switch(day%7) {
			case 1 : System.out.println("MON"); break;
			case 2 : System.out.println("TUE"); break;
			case 3 : System.out.println("WED"); break;
			case 4 : System.out.println("THU"); break;
			case 5 : System.out.println("FRI"); break;
			case 6 : System.out.println("SAT"); break;
			case 0 : System.out.println("SUN"); break;
		}
	}
}
