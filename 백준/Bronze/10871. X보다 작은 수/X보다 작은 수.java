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
		test30();
	}

	public static void test30() {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int temp = sc.nextInt();
			if(temp < b) {
				System.out.println(temp);
			}
		}
	}
}
