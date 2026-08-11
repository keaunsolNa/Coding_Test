import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			int[] table = new int[N + 1];
			boolean[] chk = new boolean[N + 1];
			for(int i = 1; i <= N; i++) table[i]= Integer.parseInt(br.readLine());
			
			int idx = 1;
			int cnt = 0;
            boolean flag = false;
            while(!chk[idx]) {
            	
            	chk[idx] = true;
                if(idx == N) {
                    flag = true;
                    break;
                }
                
                idx = table[idx];
                cnt++;
            }
            
            System.out.println(flag ? cnt : 0);
		}
		
	}
}
