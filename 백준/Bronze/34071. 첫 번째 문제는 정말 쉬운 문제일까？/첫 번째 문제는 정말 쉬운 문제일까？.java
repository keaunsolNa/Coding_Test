import java.io.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int first = 0;

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(br.readLine());
            if (i == 0) first = temp;
            min = Math.min(min, temp);
            max = Math.max(max, temp);
        }

        if (first == max) bw.write("hard");
        else if (first == min) bw.write("ez");
        else bw.write("?");
    }


}