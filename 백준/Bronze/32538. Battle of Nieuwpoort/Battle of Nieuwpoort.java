import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        boolean flag = false;

        for (int i = 2; i < 16; i++)
        {

            if (binaryParse(year, i).endsWith("00"))
            {
                flag = true;
                bw.write(i + " " + binaryParse(year, i));
                break;
            }

        }

        if (!flag) bw.write("impossible");

        bw.flush();
        bw.close();
        br.close();

    }

    // 진법 변환 진수 변환 Method
    public static String binaryParse(int n, int b) {

        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        while (n > 0) {

            if (n % b < 10) list.add((char) (n % b + '0'));
            else list.add((char) (n % b - 10 + 'a'));
            n /= b;

        }

        for (int i = list.size() - 1; i >= 0; i--) sb.append(list.get(i));
        return sb.toString();
    }

}
