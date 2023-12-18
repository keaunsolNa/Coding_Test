import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int start = 0;
        int end = 0;
        int result = 4;

        while (end < n) {

            if (arr[end] - arr[start] < 5) {
                end++;
                result = Math.min(result, 5 - (end - start));
            } else start++;
        }

        System.out.println(result);
	}
}
