import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total = 0;
        while (n --> 0)
        {
            String str = br.readLine();
            if (str.startsWith("C")) total++;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }


}