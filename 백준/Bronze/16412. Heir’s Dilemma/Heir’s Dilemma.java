import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int ans = 0;

        for (int i = l; i <= h; i++) {
            if (solve(i)) ans++;
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean solve (int num)
    {
        int[] cnt = new int[10];
        int tmp = num;

        while (tmp > 0) {
            int digit = tmp % 10;
            cnt[digit]++;
            tmp /= 10;
        }

        if (cnt[0] > 0) return false;

        for (int i = 0; i < 10; i++) {
            if (cnt[i] >= 2) return false;
        }

        for (int i = 1; i < 10; i++) {
            if (cnt[i] > 0 && num % i != 0) return false;
        }

        return true;
    }
}
