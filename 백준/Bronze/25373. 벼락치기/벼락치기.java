import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if(n <= 28) {
            for(int i = 1; i <= 7; i++) {

                int sum = 0;
                for(int j = 1; j <= i; j++) sum += j;
                if(n <= sum) { System.out.println(i); return; }

            }
        }

        else System.out.println((n - 29) / 7 + 8);
	}
}
