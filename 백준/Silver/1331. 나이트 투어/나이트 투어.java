import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int moveX[] = {1, 2, 2, 1, -1, -2, -2, -1};
		int moveY[] = {2, 1, -1, -2, -2, -1, 1, 2};
		boolean visit[][] = new boolean[6][6];
		String str[] = new String[37];
		
		for(int i = 0; i < 36; i++) str[i] = br.readLine();
		
		str[36] = str[0];
		int idx = 0;
		boolean chk = true;
		
		while(idx < 36) {
			
			String current = str[idx];
			String next = str[idx + 1];
			
			char currentX = current.charAt(0);
            char currentY = current.charAt(1);
            
            visit[currentY - '0' - 1][currentX - 'A'] = true;
            
            char nextX = next.charAt(0);
            char nextY = next.charAt(1);
            
            int diffX = Math.abs(currentX - nextX);
            int diffY = Math.abs(currentY - nextY);
            boolean isTrue = false;
            
            for(int d = 0; d < 8; d++) {
                if(moveX[d] == diffX && moveY[d] == diffY) {
                    isTrue = true;
                    break;
                }
            }
            
            if(!isTrue) {
            	chk = false;
                System.out.println("Invalid");
                return;
            }
            
            if(visit[nextY - '0' - 1][nextX - 'A']) {
                if(idx != 35) {
                	chk = false;
                    System.out.println("Invalid");
                    return;
                }
            }
            
            idx++;
            
		}
		
		if(chk) System.out.println("Valid");
		
	}
}
