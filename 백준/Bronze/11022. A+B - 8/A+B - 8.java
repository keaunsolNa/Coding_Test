import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test07();
	}

	public static void test07(){
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			int temp = sc.nextInt();
			int temp2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + temp + " + " + temp2 + " = " + (temp+temp2));
		}
	}
}
