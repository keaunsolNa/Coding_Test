import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static int count = 0;

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        makeArr(N);
        System.out.println(count);
	}

    public static void makeArr(int N) {
        int[] a = new int[N];
        countArr(a, 0);
    }

    public static void countArr(int[] q, int n) {
        int N = q.length;
        
        if (n == N) {
        	
            count++;
            
        } else {
        	
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (checking(q, n)) countArr(q, n + 1);   
            }
            
        }
    }

    public static boolean checking(int[] q, int n) {
    	
        for (int i = 0; i < n; i++) {
        	
            if (q[i] == q[n]) return false;   // 같은 열
            if ((q[i] - q[n]) == (n - i)) return false;   // '\' 방향
            if ((q[n] - q[i]) == (n - i)) return false;   // '/' 방향
            
        }
        
        return true;
    }

}
