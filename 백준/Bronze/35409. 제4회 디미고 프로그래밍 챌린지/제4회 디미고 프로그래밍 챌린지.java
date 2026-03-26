import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (h == 6)
        {
            if (m >= 30) bw.write("Yes");
            else bw.write("No");
        }
        else if (h >= 7 && h <= 8)
        {
            bw.write("Yes");
        }
        else if (h == 9)
        {
            if (m == 0) bw.write("Yes");
            else if (m >= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 10)
        {
            if (m == 0) bw.write("Yes");
            else if (m >= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 11)
        {
            if (m == 0) bw.write("Yes");
            else if (m >= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 12)
        {
            if (m == 0) bw.write("Yes");
            else if (m >= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 13)
        {
            if (m <= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 14)
        {
            if (m >= 40 && m <= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 15)
        {
            if (m >= 40 && m <= 50) bw.write("Yes");
            else bw.write("No");
        }
        else if (h == 16)
        {
            if (m >= 40) bw.write("Yes");
            else bw.write("No");
        }
        else if (h >= 17 && h <= 21)
        {
            bw.write("Yes");
        }
        else if (h == 22)
        {
            if (m <= 50) bw.write("Yes");
            else bw.write("No");
        }
        else
        {
            bw.write("No");
        }

        bw.flush();
        bw.close();
    }
}