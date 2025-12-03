import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        while (true) {

            String str = br.readLine();
            if (str.equals("end")) break;

            switch (str) {
                case "animal" : bw.write("Panthera tigris\n"); break;
                case "flower" : bw.write("Forsythia koreana\n"); break;
                case "tree" : bw.write("Pinus densiflora\n"); break;
            }

        }

    }


}