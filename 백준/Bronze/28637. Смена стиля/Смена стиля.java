import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        while (n --> 0)
        {
            char[] input = br.readLine().toCharArray();
            for (int i = 0; i < input.length; i++)
            {
                int c = input[i];
                if (c >= 97) bw.write((char)c);
                else if (i == 0) bw.write((char) (c + 32));
                else bw.write("_" + (char)(c + 32));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}