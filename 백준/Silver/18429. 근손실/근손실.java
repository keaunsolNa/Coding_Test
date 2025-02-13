import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {
	
	private static int n, k, ans;
	private static int[] kit, day, visited;

	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        kit = new int[n];
        day = new int[n];
        visited = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) kit[i] = Integer.parseInt(st.nextToken());
        
        dfs(0);

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
	
	private static void dfs(int cnt)
	{
		if (cnt == n) 
		{
			boolean result = check();
			if (result) ans++;
			
			return;
		}
		
		for (int i = 0; i < n; i++)
		{
			if (visited[i] == 1)
				continue;
			
			visited[i] = 1;
			day[cnt] = i;
			dfs(cnt + 1);
			visited[i] = 0;
		}
	}
	private static boolean check() 
	{
		
		int nowW = 500;
		for (int i = 0; i < n; i++)
		{
			int idx = day[i];
			
			nowW += kit[idx];
			nowW-= k;
			if (nowW < 500) return false;
		}
		
		return true;
	}
}
