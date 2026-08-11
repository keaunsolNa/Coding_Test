import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int test = 1; test <= t; test++) {
        	
            String s = br.readLine();
            int n = s.length();
            int[] cnt = new int[256];

            for (int i = 0; i < n; i++) cnt[s.charAt(i)]++;
            

            int[] out = new int[10];
            int[] sz = {4, 3, 3, 5, 4, 4, 3, 5, 5, 4};
            String[] sp = {"Z-W-U-X-G-", "-O-H-F-S-I"};
            String[] num = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 10; j++) {
                    if (cnt[sp[i].charAt(j)] > 0) {
                        int c = out[j] = cnt[sp[i].charAt(j)];
                        for (int k = 0; k < sz[j]; k++) {
                            cnt[num[j].charAt(k)] -= c;
                        }
                    }
                }
            }

            System.out.print("Case #" + test + ": ");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < out[i]; j++) {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}
