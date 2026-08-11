import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test09();
	}

	public static void test09() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int cnt = 0;
        for (int i = 1; i <= n; i++) {
            cnt += count(i, d);
        }
	
        System.out.println(cnt);
	}

	static int count(int num, int d) {
        int cnt = 0;
        
        while (num != 0) {
            if (num%10 == d)
                cnt++;
            num /= 10;
        }
        return cnt;
	}
}
