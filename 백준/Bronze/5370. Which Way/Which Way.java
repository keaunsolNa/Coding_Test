import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String input = "";
        while ( (input = br.readLine()) != null)
        {

            int seq = Integer.parseInt(input);
            char[] binary = Integer.toBinaryString(seq).toCharArray();
            int one = 0, zero = 0;
            for (char c : binary)
            {
                if (c == '0') zero++;
                else one++;
            }

            bw.write(one > zero ? "right" : zero > one ? "left" : "straight");
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }



}

