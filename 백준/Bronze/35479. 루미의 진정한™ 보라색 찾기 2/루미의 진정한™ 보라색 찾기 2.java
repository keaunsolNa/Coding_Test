import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double r = Double.parseDouble(st.nextToken());
        double g = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        double rp = r / 255;
        double gp = g / 255;
        double bp = b / 255;
        double k = 1 - Math.max(rp, Math.max(gp, bp));

        double c = k == 1 ? 0 : (1 - rp - k) / (1 - k);
        double m = k == 1 ? 0 : (1 - gp - k) / (1 - k);
        double y = k == 1 ? 0 : (1 - bp - k) / (1 - k);

        String kf = String.format("%.5f", k);
        String cf = String.format("%.5f", c);
        String mf = String.format("%.5f", m);
        String yf = String.format("%.5f", y);
        bw.write(cf + " " + mf + " " + yf + " " + kf);
        bw.flush();
        bw.close();
    }
}