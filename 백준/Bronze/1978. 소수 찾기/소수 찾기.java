import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		test11();
	}

    public static void test11() {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < testCase; i++) {
			
			long isPrime = sc.nextInt();
			if(isPrime(isPrime)) {
				cnt++;
			}
			
		}
		System.out.println(cnt);
    }

    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}
