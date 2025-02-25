import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int answer = -1;

        for (int i = n + 1; i <= 9999; i++)
        {

            int total = ((i / 100) + (i % 100)) * ((i / 100) + (i % 100));
            if (i == total)
            {
                answer = i;
                break;
            }
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
