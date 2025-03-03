import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();

        if ("null".equals(A)) {
            A = null;
        }
        if ("null".equals(B)) {
            B = null;
        }

        try {
            bw.write(A.equals(B) ? "true\n" : "false\n");
        } catch (NullPointerException e) {
            bw.write("NullPointerException\n");
        }

        try {
            bw.write(A.equalsIgnoreCase(B) ? "true\n" : "false\n");
        } catch (NullPointerException e) {
            bw.write("NullPointerException\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
