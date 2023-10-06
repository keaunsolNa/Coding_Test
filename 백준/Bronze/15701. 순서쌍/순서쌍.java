import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
        int cnt = 0;
        boolean square = false;

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) cnt++;
            if (i * i == N) square = true;
        }

        if (!square) cnt *= 2;
        else cnt = cnt * 2 - 1;
			
        System.out.println(cnt);
	}
}
