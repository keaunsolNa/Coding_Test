import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		test02();
	}

	public static void test02() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			
			String[] pk1 = br.readLine().split(" ");
			String[] pk2 = br.readLine().split(" ");
			String[] cryptogram = br.readLine().split(" ");
			int[] index = new int[N];
			String res[] = new String[N];
			
			
			for(int i = 0; i < N; i++) map.put(pk1[i], i);
			for(int i = 0; i < N; i++) index[i] = map.get(pk2[i]);
			for(int i = 0; i < N; i++) res[index[i]] = cryptogram[i];
			
			for(int i = 0; i < N; i++) System.out.print(res[i] + " ");
		}
	}
}
