import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<String> dic = new ArrayList<>();
        while (n --> 0)
        {
            dic.add(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());
        while (m --> 0)
        {
            String input = br.readLine();

            if (dic.contains(input))
            {
                bw.write("1\n");
            }
            else
            {

                boolean b = false;
                for (int i = 1; i < input.length(); i++)
                {
                    if (dic.contains(input.substring(0, i)) && dic.contains(input.substring(i)))
                    {
                        b = true;
                        break;
                    }
                }

                bw.write(b ? "2\n" : "0\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}