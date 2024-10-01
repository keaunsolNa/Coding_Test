import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int cnt = switch (input) {
            case "()1", "1()", "1)(", ")(1" -> 1;
            case ")1(" -> 2;
            default -> 0;
        };

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();

    }

}
