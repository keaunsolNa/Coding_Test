import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++) {
        	
        	String temp = br.readLine();
        	for(int j = 0; j < M; j++) map[i][j] = (temp.charAt(j) == '-') ? 1 : 0;
        	
        }
    
        int x = 0;
        for(int i = 0; i < N; i++) {

        	int prevX = map[i][0];
        	x += prevX;
        	boolean chk = (prevX == 1) ? true : false;
        	for(int j = 1; j < M; j++) {
        		
        		if(map[i][j] != 1) {
        			chk = false;
        		} else {
        			if(!chk) x++;
        			chk = true;
        		}
        	}
        }
        
        int y = 0;
        for(int i = 0; i < M; i++) {
        	
        	int prevY = map[0][i];
        	y += (prevY == 0) ? 1 : 0;
        	boolean chk = (prevY == 0) ? true : false;
        	
        	for(int j = 1; j < N; j++) {
        		
        		if(map[j][i] != 0) {
        			chk = false;
        		} else {
        			if(!chk) y++;
        			chk = true;
        		}
        	}
        }
        
        System.out.println(x + y);
	}
}
