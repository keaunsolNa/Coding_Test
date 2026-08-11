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
    private static int[] visted;
    private static ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();
    private static int N;
	private static int M;

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int r =Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < N + 1; i++) graph2.add(new ArrayList<Integer>());
        
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph2.get(u).add(v);
            graph2.get(v).add(u);
        }
        
        for(int i = 0; i < graph2.size(); i++) Collections.sort(graph2.get(i));
        cnt = 1;
        visted = new int[N + 1];
        dfs1(r);
        
        for(int i = 0; i < visted.length; i++) if(i != 0) System.out.println(visted[i]);
	}

    private static void dfs1(int x){
        visted[x] = cnt;
        for(int i = 0 ;i < graph2.get(x).size(); i++){

        	int y = graph2.get(x).get(i);
            if(visted[y] == 0){
                cnt++;
                dfs1(y);
            }
        }
    }
}
