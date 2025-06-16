import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int ans = -1;

        if (input.endsWith("a") || input.endsWith("e") || input.endsWith("i") || input.endsWith("o")
                || input.endsWith("u") || input.endsWith("n") || input.endsWith("s")) {

            int cnt = 0;
            for (int i = input.length() - 1; i >= 0; i--) {

                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    cnt++;
                    if (cnt == 2)
                    {
                        ans = i;
                        break;
                    }
                }
            }
        }

        else {

            for (int i = input.length() - 1; i >= 0; i--) {

                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                    ans = i;
                    break;
                }
            }
        }

        bw.write(String.valueOf(ans == -1 ? ans : ans + 1));
        bw.flush();
        bw.close();
        br.close();
    }


}