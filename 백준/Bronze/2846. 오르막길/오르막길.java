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
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int max = 0;
        int stair = 0;
        for(int i = 1; i < arr.length; i++) {
        	if(arr[i] > arr[i-1]) {
        		stair += arr[i] - arr[i-1];
        	} else {
        		if(max < stair) max = stair;
        		stair = 0;
        	}
        }
        
        if(max < stair) max = stair;
        
        System.out.println(max);
	}
}
