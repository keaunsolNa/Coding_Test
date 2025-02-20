import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int idx = 0;

        while (idx < 26)
        {

            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray())
            {
                int index = c - 'A';
                if (index - idx < 0) sb.append((char) (index - idx + 26 + 65));
                else sb.append((char) (index - idx + 65));
            }

            sb.append("\n");
            idx++;

            bw.write(sb.toString());
        }


        bw.flush();
        bw.close();
        br.close();

    }

}
