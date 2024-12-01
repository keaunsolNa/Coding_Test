import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int q = Integer.parseInt(br.readLine());
        while (q --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp = a < b ? b - a : 2000;
            int inner = Math.min(temp, 243 - a + b - 201 + 1);

            temp = b < a ? a - b : 2000;
            int outer = Math.min(temp, a - 201 + 243 - b + 1);
            
            sb.append(inner > outer ? "Outer circle line" : outer == inner ? "Same" : "Inner circle line").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


}
