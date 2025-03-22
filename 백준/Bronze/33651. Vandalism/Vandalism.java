import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        if (!str.contains("U")) bw.write("U");
        if (!str.contains("A")) bw.write("A");
        if (!str.contains("P")) bw.write("P");
        if (!str.contains("C")) bw.write("C");

        bw.flush();
        bw.close();
        br.close();
    }


}