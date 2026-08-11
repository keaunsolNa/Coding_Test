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
		test15();
	}

    public static void test15() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int temp = 1;
		int i = 1;
		if(N != 1) {
			while(N > temp) {
				temp += (i*6);
				i++;
			}
		}
		
		System.out.println(i);
    }
}
