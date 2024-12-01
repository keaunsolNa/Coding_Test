import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String str = br.readLine();
        if (str.indexOf('(') == -1)
        {
            bw.write(str + "\n-");
        }
        else
        {
            bw.write(str.substring(0, str.indexOf('(') - 1) + "\n" + str.substring(str.indexOf('(') + 1, str.indexOf(')')));
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
