import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		int idx = 1;
		while(true) {
			
			sb = new StringBuilder();
			
			sb.append("Group " + idx + "\n");
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			String list[][] = new String[N][N];
			 
            for (int i = 0; i < N; i++) {
                String str[] = br.readLine().split(" ");
                list[i] = str;
            }
 
            int CR = 0;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
 
                    if (list[i][j].equals("N")) {
 
                        CR = i - j;
                        if (CR < 0) CR += N;
 
                        sb.append(list[CR][0] + " was nasty about " + list[i][0] + "\n");
                        cnt++;
                    }
                }
            }
            
            if(cnt == 0) sb.append("Nobody was nasty"+"\n");
            
            System.out.println(sb);
			idx++;
		}
		
		
	}
}
