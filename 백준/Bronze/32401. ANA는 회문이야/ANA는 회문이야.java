import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int b = Integer.parseInt(br.readLine());
        String input = br.readLine();

        if (input.chars().filter(ch -> ch == 'A').count() < 2)
        {
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
            return;
        }
        
        String[] s = input.substring(input.indexOf('A'), input.lastIndexOf('A')).split("A");
        int cnt = 0;

        for (String str : s)
        {
            if (str.chars().filter(ch -> ch == 'N').count() == 1 && !str.isEmpty())
            {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }

}
