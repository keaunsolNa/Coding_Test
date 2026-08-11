import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		test10();
	}

	public static void test10() {
		int wordChecker = 0;
		int testCase = sc.nextInt();
		
		for(int i = 0; i < testCase; i++) {
			if(checker() == true) {
				wordChecker++;
			}
		}
		System.out.println(wordChecker);
	}

	public static boolean checker() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			if(prev != now) {
				
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					prev = now;
					
				} else {
					return false;
				}
				
			} else {
				continue;
			}
		}
		return true;
		
	}
}
