import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int S = Integer.parseInt(st.nextToken()); 
		int R = Integer.parseInt(st.nextToken()); 
		int[] team = new int[N];
		int result = 0;
		
		Arrays.fill(team, 1);
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<S;i++) {
			int index = Integer.parseInt(st.nextToken())-1;
			team[index]--;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<R;i++) {
			int index = Integer.parseInt(st.nextToken())-1;
			team[index]++;
		}
		
		for(int i=0;i<N-1;i++) {
			if(team[i] == 0 && team[i+1] == 2) {
				team[i]++;
				team[i+1]--;
			}
			else if(team[i+1] == 0 && team[i] == 2) {
				team[i+1]++;
				team[i]--;
			}
		}
		
		for(int t:team) {
			if(t==0) result++;
		}
		
		bw.write(result+"");
		bw.flush();
		bw.close();
		
	}
}