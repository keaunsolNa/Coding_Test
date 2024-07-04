import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int sh = Integer.parseInt(st.nextToken());
        int sm = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");

        int eh = Integer.parseInt(st.nextToken());
        int em = Integer.parseInt(st.nextToken());

        int d1 = 1440 - ((sh * 60) + sm);
        int d2 = eh * 60 + em;

        int th = (d1 + d2) / 60;
        int tm = (d1 + d2) % 60;

        System.out.println((th < 10 ? "0" + th : th) + ":" + (tm < 10 ? "0" + tm : tm));





    }


}