import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] reduce = new int[c];
        for (int i = 0; i < c; i++) reduce[i] = Integer.parseInt(br.readLine());

        for (int i = 0; i < r; i++) d += Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {

            if (d >= reduce[i]) {
                d -= reduce[i];
                r++;
            }
            else break;
        }

        System.out.println(r);




    }

}