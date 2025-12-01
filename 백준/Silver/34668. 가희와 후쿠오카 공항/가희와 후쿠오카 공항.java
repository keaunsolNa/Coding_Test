import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

        int q = Integer.parseInt(br.readLine());
        int min;

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdformat = new SimpleDateFormat("HH:mm");

        while(q-->0) {
            int m = Integer.parseInt(br.readLine());

            cal.set(2025, 12, 01, 6, 0, 0);
            int roop = m / 50;
            min = roop * 12;
            min += 6;
            cal.add(Calendar.MINUTE, min);
            bw.write(sdformat.format(cal.getTime()) + "\n");
        }
    }

}