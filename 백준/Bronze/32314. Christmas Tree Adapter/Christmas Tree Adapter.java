import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        bw.write(w / v >= a ? "1" : "0");


        bw.flush();
        bw.close();
        br.close();

    }
}