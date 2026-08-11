import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());  
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < testCase; i++) {
            int[] arr = new int[10];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int j = 0; j < 10; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);  
            sb.append(arr[7] + "\n");  
        }
        System.out.print(sb);
	}
}
