import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int agree = 1, disagree = 1;

        while (n --> 0)
        {

            agree += a;
            disagree += b;

            if (agree < disagree)
            {
                int temp = agree;
                agree = disagree;
                disagree = temp;
            }

            else if (agree == disagree) disagree--;
        }

        bw.write(agree + " " + disagree);
        bw.flush();
        bw.close();
        br.close();

    }

}
