import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] nine = new int[n][m];
        int[] rowNine = new int[n];
        int maxRowNine = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
        	
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		nine[i][j] = Integer.parseInt(st.nextToken());
        		rowNine[i] += (int)countChar(nine[i][j] + "", '9');
        		if(maxRowNine < rowNine[i]) maxRowNine = rowNine[i];
        	}
        }
        
        
        int[] colNine = new int[m];
        int maxColNine = Integer.MIN_VALUE;
        int sumNine = 0;
        for(int i = 0; i < m; i++) {			
        	for(int j = 0; j < n; j++) {		
        		colNine[i] += (int)countChar(nine[j][i] + "", '9');
        		if(maxColNine < colNine[i]) maxColNine = colNine[i];
        	}
        	sumNine += colNine[i];
        }
        
        System.out.println(sumNine - Math.max(maxColNine, maxRowNine));
	}

	public static long countChar(String str, char ch) {
		return str.chars()
				.filter(c -> c == ch)
				.count();
	}
}
