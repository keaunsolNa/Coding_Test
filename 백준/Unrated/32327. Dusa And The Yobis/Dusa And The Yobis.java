import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d = Integer.parseInt(br.readLine());
        String input = "";

        while ((input = br.readLine()) != null)
        {

            int target = Integer.parseInt(input);
            if (d > target)
            {
                d += target;
            }
            else break;
        }

        bw.write(String.valueOf(d));
        bw.flush();
        bw.close();
        br.close();

    }
}