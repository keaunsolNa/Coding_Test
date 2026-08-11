import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        for(int i = 1; i <= N; i++) arr[i-1] = i;
        
        for(int i = 0; i < M; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int a = Integer.parseInt(st.nextToken()) - 1;
        	int b = Integer.parseInt(st.nextToken()) - 1;

        	
			while (a < b) {
				int temp = arr[a];
				arr[a++] = arr[b];
				arr[b--] = temp;
			}
        	
        }
        
        for (int i : arr) System.out.print(i + " ");
	}
}
