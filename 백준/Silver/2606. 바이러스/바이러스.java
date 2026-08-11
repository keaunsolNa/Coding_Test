import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    private static int cnt;
	private static boolean visit[][];

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int node = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[node][node];
        boolean[] visit = new boolean[arr.length];
        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < cnt; i++){
        	
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken()) -1;
            int b = Integer.parseInt(st.nextToken()) -1;

            arr[a][b] = true;
            arr[b][a] = true;

        }

        int result = search(arr, visit, 0);

        System.out.println(result -1);
	}

    public static int search(boolean[][] arr, boolean[] visit, int start) {
        int result = 1;

        visit[start] = true;
        for (int i = 0 ; i < arr.length ; i++) if(arr[start][i] && !visit[i]) result += search(arr, visit, i);
        
        return result;
    }
}
