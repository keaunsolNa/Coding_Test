import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int num = 0;
        int answer = 0;

        for (char c : str.toCharArray()) {

            if (c >= '0' && c <= '9') {
                num = num * 10 + (c - '0');
            }
            else
            {
                answer += num;
                num = 0;
            }
        }

        answer += num;
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

}