import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input = br.readLine();
            bw.write(input.replaceAll("PO", "PHO"));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}