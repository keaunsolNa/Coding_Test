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
		test27();
	}

	public static void test27() {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] sArr= S.toCharArray();
		List<Integer> SArr = new ArrayList<>();
		
		for (char c : sArr) {
			SArr.add(Character.getNumericValue(c));
		}

		for(int i = 10; i < 36; i++) {
			if(SArr.contains(i)) {
				System.out.print(SArr.indexOf(i));
			} else {
				System.out.print(-1);
			}
			if(i == 35) {
				break;
			}
			System.out.print(" ");
		}
	}
}
