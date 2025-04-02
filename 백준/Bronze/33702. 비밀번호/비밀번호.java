import java.util.*;
import java.io.*;

public class Main {

    private static int n, cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        if (k == 1 || k == 3 || k == 7 || k == 9) bw.write("8");
        else if (k == 2 || k == 4 || k == 6 || k == 8) bw.write("0");
        else if (k == 5) bw.write("8");

        bw.flush();
        bw.close();
    }

}