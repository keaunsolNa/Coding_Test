import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int s = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int ma = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int mb = Integer.parseInt(st.nextToken());

        int flight = ma + f + mb;

        if (s <= 240 || flight >= s)
        {
            bw.write("high speed rail");
        }
        else bw.write("flight");

        bw.flush();
        bw.close();
        br.close();

    }


}
