import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Integer.parseInt(br.readLine());
        long ans = n * (n + 1) / 2;

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}