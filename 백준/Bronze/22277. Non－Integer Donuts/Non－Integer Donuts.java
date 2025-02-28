import java.io.*;

public class Main {

    static final long SCALE = 1_000_000L;  // 소수점 이하 6자리까지 처리

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long first = getFractionalPartAsLong(input);

        int cnt = 0;

        while (n-- > 0) {
            input = br.readLine();
            long plus = getFractionalPartAsLong(input);

            first += plus;
            first %= SCALE;

            if (first != 0) cnt++;
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }

    private static long getFractionalPartAsLong(String input) {
        if (!input.contains(".")) {
            return 0; // 소수점이 없으면 0으로 처리
        }

        String fractional = input.substring(input.indexOf(".") + 1);

        // 소수점 이하 자리수를 SCALE에 맞게 보정
        while (fractional.length() < 6) {
            fractional += "0";
        }
        if (fractional.length() > 6) {
            fractional = fractional.substring(0, 6);  // 초과 자리수 자르기
        }

        return Long.parseLong(fractional);
    }
}
