import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String input = "";
        while ((input = br.readLine()) != null)
        {
            st = new StringTokenizer(input);
            int[] arrTemp = new int[7];
            for (int i = 0; i < 7; i++)
            {
                arrTemp[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < arrTemp[6]; i++)
            {
                int m = arrTemp[0];
                arrTemp[0] = arrTemp[1] / arrTemp[5];
                arrTemp[1] = arrTemp[2] / arrTemp[4];
                arrTemp[2] = m * arrTemp[3];
            }
            bw.write(arrTemp[0] + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }
}
