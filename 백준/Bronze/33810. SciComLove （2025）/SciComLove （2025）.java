import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String origin = "SciComLove";

        int cnt = 0;
        for (int i = 0; i < origin.length(); i++) {
            if (s.charAt(i) != origin.charAt(i)) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }


}