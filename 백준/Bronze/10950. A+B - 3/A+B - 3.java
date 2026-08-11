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
		test31();
	}

	public static void test31() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
}
