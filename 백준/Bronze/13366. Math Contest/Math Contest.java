import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        while (x --> 0)
        {

            long sum = 0;
            char[] temp = br.readLine().toCharArray();
            for (char c : temp)
            {
                sum += (c - '0');
            }

            bw.write(sum % 9 == 0 ? "YES" : "NO");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
