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
		test32();
	}

	public static void test32() {
        Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
	}
}
