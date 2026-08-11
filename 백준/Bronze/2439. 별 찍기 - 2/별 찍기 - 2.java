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
		test09();
	}

	public static void test09() {
        Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		
		for(int i = a; i > 0; i--) {
			
			for(int j = i - 1; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < a - i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
