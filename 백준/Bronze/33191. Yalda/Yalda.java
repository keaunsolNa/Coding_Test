import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        bw.write(t >= a ? "Watermelon" : t >= b ? "Pomegranates" : t >= c ? "Nuts" : "Nothing");
        bw.flush();
        bw.close();
        br.close();

    }

}
