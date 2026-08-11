import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test36();
	}

	public static void test36() {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		String number = sc.next();
		int sum = 0;

		char[] numberArr = number.toCharArray();
		
		for(int i = 0; i < numberArr.length; i++) {
			sum += Character.getNumericValue(numberArr[i]);
		}
		
		System.out.println(sum);
	}
}
