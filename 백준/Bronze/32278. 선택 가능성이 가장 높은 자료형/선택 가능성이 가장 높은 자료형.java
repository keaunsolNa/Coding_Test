import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        if (n >= - 32768 && n <= 32767) bw.write("short");
        else if (n >= -2147483648 && n <= 2147483647) bw.write("int");
        else bw.write("long long");

        bw.flush();
        bw.close();
        br.close();

    }

}