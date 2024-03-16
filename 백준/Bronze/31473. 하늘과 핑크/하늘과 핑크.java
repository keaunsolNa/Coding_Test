import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) a += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) b += Integer.parseInt(st.nextToken());

        System.out.println(b + " " + a);



    }
}
