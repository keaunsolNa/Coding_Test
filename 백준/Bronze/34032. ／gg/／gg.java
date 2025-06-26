import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] ox = br.readLine().toCharArray();
        int need = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int have = 0;

        for (char c : ox) {
            if (c == 'O') have++;
        }

        bw.write(have >= need ? "Yes" : "No");
        bw.flush();
        bw.close();
        br.close();

    }


}