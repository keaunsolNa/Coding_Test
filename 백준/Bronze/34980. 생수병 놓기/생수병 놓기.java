import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        int cnt = 0;
        int cnt2 = 0;
        boolean flag = false;
        while (n --> 0)
        {
            if (arr1[n] != arr2[n]) flag = true;
            cnt += arr1[n] == 'w' ? 1 : 0;
            cnt2 += arr2[n] == 'w' ? 1 : 0;
        }

        if (cnt == cnt2 && !flag) bw.write("Good");
        else if (cnt < cnt2) bw.write("Manners maketh man");
        else if (cnt > cnt2) bw.write("Oryang");
        else bw.write("Its fine");

    }


}