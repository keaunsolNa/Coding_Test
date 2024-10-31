import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        st = new StringTokenizer(br.readLine());
        arr[0] = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
        boolean flag = true;

        for (int i = 1; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            arr[i] = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
            if (arr[i][0] < arr[i - 1][0] || arr[i][1] < arr[i - 1][1])
            {
                flag = false;
            }
        }

        bw.write(flag ? "yes" : "no");
        bw.flush();
        bw.close();
        br.close();

    }

}
