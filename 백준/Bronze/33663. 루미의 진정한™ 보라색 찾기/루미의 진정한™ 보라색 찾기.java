import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double h1 = Integer.parseInt(st.nextToken());
        double h2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double s1 = Integer.parseInt(st.nextToken());
        double s2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double v1 = Integer.parseInt(st.nextToken());
        double v2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        double R = Integer.parseInt(st.nextToken());
        double G = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        double M = Math.max(Math.max(R, G), B);
        double m = Math.min(Math.min(R, G), B);

        double S = 255 * (M - m) / M;

        double H = M == R ? 60 * (G - B) / (M - m) : M == G ? 120 + 60 * (B - R) / (M - m) : 240 + 60 * (R - G) / (M - m);
        if (H < 0) H += 360;

        boolean flag = false;
        if (H >= h1 && H <= h2)
            if (S >= s1 && S <= s2)
                if (M >= v1 && M <= v2) flag = true;

        bw.write(flag ? "Lumi will like it." : "Lumi will not like it.");
        bw.flush();
        bw.close();
    }
}