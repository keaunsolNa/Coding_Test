import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double n = Double.parseDouble(br.readLine());
        bw.write(String.valueOf((int)Math.floor(n)));


        bw.flush();
        bw.close();
        br.close();

    }


}
