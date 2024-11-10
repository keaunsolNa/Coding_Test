import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Integer.parseInt(br.readLine());
        double[] total = new double[3];
        for (int i = 0; i < n; i++)
        {
            String input = br.readLine();

            if (input.contains("blue") && input.contains("black"))
            {
                total[0]++;
            }

            else if (input.contains("white") && input.contains("gold"))
            {
                total[1]++;
            }
            else
            {
                total[2]++;
            }
        }

        for (int i = 0; i < 3; i++)
        {
            double percent = total[i] / n * 100;
            bw.write( String.format("%.10f", percent) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
