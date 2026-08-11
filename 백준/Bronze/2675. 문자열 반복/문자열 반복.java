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
		test14();
	}

	public static void test14() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < testCase; i++) {
			String testString = sc.nextLine();
			int replay = Integer.parseInt(testString.split(" ")[0]);
			char[] temp = testString.split(" ")[1].toCharArray();
			for(int j = 0; j < temp.length; j++) {
				for(int k = 0; k < replay; k++) {
					System.out.print(temp[j]);
				}
			}
			System.out.println();
		}
	}
}
