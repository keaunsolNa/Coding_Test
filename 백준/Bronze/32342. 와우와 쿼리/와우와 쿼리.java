import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {

            String input = br.readLine();
            int ans = 0;

            for (int j = 0; j <= input.length() - 3; j++)
            {
                if (input.startsWith("WOW", j)) ans++;
            }

            bw.write(ans + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
