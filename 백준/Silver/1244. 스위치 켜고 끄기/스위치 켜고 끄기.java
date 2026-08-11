import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	private static int[] button;

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		button = new int[N + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i < N + 1; i++) button[i] = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < s; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(Integer.parseInt(st.nextToken()) == 1) {
				int number = Integer.parseInt(st.nextToken());
				
				man(number);

			} else {
				
				int number = Integer.parseInt(st.nextToken());
				women(number);
				
			}
			
		}
		
        for(int i = 1; i < button.length; i++) {
        	sb.append(button[i] + " ");
        	if(i % 20 == 0) sb.append("\n");
        }
        
        System.out.print(sb);
	}

    private static void man(int x) {
    	int now = x;
    	
    	while(now < button.length) {
    		button[now] = button[now] == 1 ? 0 : 1;
    		now += x;
    	}
    }

    private static void women(int x) { 	

		button[x] = button[x] == 1 ? 0 : 1;
    	
    	int count = 1;
    	while((x - count) > 0 && (x + count) < button.length) {
    		
    		if(button[x + count] == button[x - count]) {
    			
    			button[x + count] = button[x + count] == 1 ? 0 : 1;
    			button[x - count] = button[x - count] == 1 ? 0 : 1;
    			count++;
    			
    		} else break;
    		
    	}
    }
}
