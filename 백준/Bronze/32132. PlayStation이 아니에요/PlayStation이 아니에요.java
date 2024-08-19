import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        for (int i = 0; i < n; i++) {

            char c = input[i];

            if ((c == '4' || c == '5') &&
                    sb.length() > 1 &&
                    (sb.charAt(sb.length() - 2) == 'P' && sb.charAt(sb.length() - 1) == 'S')
                )
            {
                continue;
            }

            sb.append(c);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


}
