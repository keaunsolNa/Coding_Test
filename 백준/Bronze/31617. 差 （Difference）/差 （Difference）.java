import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        int n = Integer.parseInt(br.readLine());
        int[] aArr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) aArr[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] bArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) bArr[i] = Integer.parseInt(st.nextToken());

        int ans = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if(aArr[i] + k == bArr[j]) ans++;
            }
        }

        System.out.println(ans);
    }
}
