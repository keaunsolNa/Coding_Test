import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test07();
	}

	public static void test07() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) map.put(st.nextToken(), i);
        

        String[] input = br.readLine().split(" ");

        int cnt = 0;

        for (int i = 0; i < N - 1; i++) 
            for (int j = i + 1; j < N; j++) 
            	if (map.get(input[i]) < map.get(input[j])) cnt++;

        System.out.println(cnt + "/" + N * (N - 1) / 2);

	}
}
