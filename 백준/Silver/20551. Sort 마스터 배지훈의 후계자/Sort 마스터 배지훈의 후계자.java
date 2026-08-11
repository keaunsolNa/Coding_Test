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
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
        int[] arr = new int[N];
        
        for(int i = 0 ; i < N ; i++) arr[i] = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < N ; i++) if(!map.containsKey(arr[i])) map.put(arr[i], i);

        while(M-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(map.containsKey(x)) sb.append(map.get(x)).append("\n");
            else sb.append(-1).append("\n");
        }

        System.out.println(sb);
			
	}
}
