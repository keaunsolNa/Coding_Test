import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        for (char c : input)
        {
            bw.write(c == 'I' ? "i" : "L");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
