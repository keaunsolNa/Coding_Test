import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int targetPay = 0;
        int[] arr = new int[n];
        while(n --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String target = st.nextToken();
            int pay = Integer.parseInt(st.nextToken());

            if(target.equals("jinju")) targetPay = pay;
            arr[n] = pay;
        }

        Arrays.sort(arr);
        int idx = 0;
        for (int j : arr) if (j > targetPay) idx++;
        
        System.out.println(targetPay);
        System.out.println(idx);
	}
}
