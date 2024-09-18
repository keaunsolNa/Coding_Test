import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());
        int g = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());


        bw.write(String.valueOf(r * 3 + g * 4 + b * 5));
        bw.flush();
        bw.close();
        br.close();

    }
}