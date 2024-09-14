import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] iArr = new int[n];
        int[] jArr = new int[n];
        int a = -1;

        while (n --> 0)
        {
            bw.write((a += 2) + " ");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}