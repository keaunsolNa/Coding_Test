import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int team1 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 2 + Integer.parseInt(st.nextToken()) * 3;

        st = new StringTokenizer(br.readLine());
        int team2 = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 2 + Integer.parseInt(st.nextToken()) * 3;

        bw.write(team1 > team2 ? "1" : team1 < team2 ? "2" : "0");
        bw.flush();
        bw.close();
        br.close();

    }
}