import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double d = Double.parseDouble(st.nextToken());
        double h = Double.parseDouble(st.nextToken());

        double outerDiameter = d + 10;
        double outerRadius = outerDiameter / 2.0;

        double lateralArea = Math.PI * outerDiameter * h;
        double topArea = Math.PI * outerRadius * outerRadius;

        double totalCanvas = lateralArea + topArea;

        bw.write(String.format("%.6f", totalCanvas));
        bw.flush();
        bw.close();
        br.close();

    }

}
