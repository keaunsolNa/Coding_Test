import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String[] number = br.readLine().split("-");
        boolean[] arr = new boolean[10];
        for (String num : number)
        {

            for (char c : num.toCharArray())
            {
                arr[c - '0'] = true;
            }
        }

        int total = 0;
        for (boolean b : arr)
        {
            if (b) total++;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }
}