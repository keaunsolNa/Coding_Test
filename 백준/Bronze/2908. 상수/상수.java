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
		test20();
	}

	public static void test20() {
		Scanner sc = new Scanner(System.in);
		String[] string = sc.nextLine().split(" ");

		int answer = 0;
		
		for(int i = 0; i < string.length; i++) {
			StringBuilder sbr = new StringBuilder(new String(string[i].toCharArray()));
			int reverse = Integer.parseInt(sbr.reverse().toString());
			if(answer < reverse) {
				answer = reverse;
			};
		}
		
		System.out.println(answer);
	}
}
