import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] arr = new double[10];
        
        for(int i = 0; i < 10; i++) arr[i] = Double.parseDouble(br.readLine());
        
        Arrays.sort(arr);
        
        double ans = 1;
        for(int i = 1; i < 10; i++) ans *= (arr[i] / i);
        
        System.out.printf("%.6f", ans * 1000000000);
	}
}
