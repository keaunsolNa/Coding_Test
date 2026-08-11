import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test10();
	}

	public static void test10() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		Integer[] pen = new Integer[N];
		for(int i = 0; i < N; i++) {
			pen[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(pen, Comparator.reverseOrder());
		
		int needPen = M * K;
		int idx = 0;
		while(needPen > 0) {
			
			if(idx >= pen.length) break;
			needPen -= pen[idx];
			idx++;
		}
		
		if(needPen > 0) 
			System.out.println("STRESS");
		else 
			System.out.println(idx);
	}
}
