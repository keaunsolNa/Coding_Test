import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        char[] prefix = input.substring(0, input.length() / 2).toCharArray();
        char[] suffix = input.substring(input.length() / 2).toCharArray();

        int prefFixSum = 0;
        for (char c : prefix) {
            prefFixSum += c - 'A';
        }

        int suffixFixSum = 0;
        for (char c : suffix) {
            suffixFixSum += c - 'A';
        }

        StringBuilder sb = new StringBuilder();
        for (char c : prefix) {

            int temp = c - 'A';
            temp += prefFixSum;
            temp %= 26;
            sb.append((char)(temp + 'A'));
        }

        for (char c : suffix) {
            int temp = c - 'A';
            temp += suffixFixSum;
            temp %= 26;
            sb.append((char) (temp + 'A'));
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < sb.length() / 2; i++) {

            int temp = sb.charAt(i) - 'A';
            temp += (sb.toString().charAt(sb.length() / 2 + i) - 'A');
            temp %= 26;
            answer.append((char)(temp + 'A'));
        }

        System.out.println(answer);
        bw.flush();
        br.close();
        bw.close();
    }

}