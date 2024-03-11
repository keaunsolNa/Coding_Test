import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        double m = Integer.parseInt(st.nextToken());
        double n = Integer.parseInt(st.nextToken());

        double min = Integer.MAX_VALUE;
        min = Math.min(min, (m / a) * 2);
        min = Math.min(min, Math.max((m / a), n));
        min = Math.min(min, (n / a) * 2);
        min = Math.min(min, Math.max(m , (n / a)));

        System.out.println(min);
    }

}
