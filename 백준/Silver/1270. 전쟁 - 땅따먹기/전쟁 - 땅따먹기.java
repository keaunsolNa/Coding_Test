import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        while (n-- > 0) {
        	
            System.gc();	// 가비지콜렉터 호출
            
            TreeMap<Long, Integer> map = new TreeMap<>();
            long res = 0;
            long idx = -1;
            
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            
            for (int i = 0; i < T; i++) {
            	
                long num = Long.parseLong(st.nextToken());
                map.put(num, map.getOrDefault(num, 0) + 1);
                
                long tmp = map.get(num);
                if (tmp > res) {
                    idx = num;
                    res = tmp;
                }
            }
            
            if (res > T / 2) sb.append(idx).append('\n');
            else sb.append("SYJKGW").append('\n');
            
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        
	}
}
