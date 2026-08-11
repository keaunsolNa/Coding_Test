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
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N;
		int M;
		int i;
		int j;
		int mxcnt;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[] mx = new int[M];
		int[] cnt = new int[N];
		
		for(i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(j = 0; j < M; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		for(i = 0; i < N; i++) Arrays.sort(arr[i]);
		
		for(i = 0; i < N; i++) {
			for(j = 0; j < M; j++) mx[j] = Math.max(mx[j], arr[i][j]);
		}
		
		for(i = 0; i < N;i++) {
			for(j = 0; j < M; j++) {
				if(mx[j]==arr[i][j]) cnt[i]++;
			}
		}
		
		mxcnt = 0;
		for(i = 0; i < N; i++) mxcnt = Math.max(mxcnt, cnt[i]); 

		for(i = 0; i < N; i++) {
			if(mxcnt==cnt[i]) sb.append((i+1)+" ");
		}
		System.out.println(sb);
	}
}
