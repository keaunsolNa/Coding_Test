import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long f = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long e = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long fm = Integer.parseInt(st.nextToken());
        long cm = Integer.parseInt(st.nextToken());
        long em = Integer.parseInt(st.nextToken());
        long bm = Integer.parseInt(st.nextToken());

        int q = Integer.parseInt(br.readLine());
        long cookie = 0;

        while (q --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());

            switch (query)
            {
                case 1 :

                    if ((f >= (fm * i)) && (c >= (cm * i)) && (e >= (em * i)) && b >= ((bm * i)))
                    {

                        cookie += i;

                        f -= (fm * i);
                        c -= (cm * i);
                        e -= (em * i);
                        b -= (bm * i);

                        bw.write(String.valueOf(cookie));
                    }

                    else bw.write("Hello, siumii");

                    break;

                case 2 : f += i; bw.write(String.valueOf(f)); break;

                case 3 : c += i; bw.write(String.valueOf(c)); break;

                case 4 : e += i; bw.write(String.valueOf(e)); break;

                case 5 : b += i; bw.write(String.valueOf(b)); break;
            }

            if (q > 0) bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}