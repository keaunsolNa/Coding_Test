import java.io.*;
        import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++)
        {
            list.add(i);
        }

        int bf = 0;

        for (int i = 1; i < n; i++)
        {
            int removeNum = (bf + getPow3WithMod(i, list.size()) - 1) % list.size();
            if (removeNum < 0) removeNum += list.size();
            list.remove(bf = removeNum);
        }

        bw.write(String.valueOf(list.get(0)));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int getPow3WithMod(int i, int mod) {
        int ans = i;
        ans *= i;
        ans %= mod;
        ans *= i;
        return ans % mod;
    }

}
