import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        bw.write(s > f ? "flight" : "high speed rail");
        bw.flush();
        bw.close();
        br.close();

    }


}
