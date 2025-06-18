import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        while (t --> 0)
        {
            int target = Integer.parseInt(br.readLine());
            bw.write(Math.sqrt(target) == (int) Math.sqrt(target) ? "1" : "0");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }


}