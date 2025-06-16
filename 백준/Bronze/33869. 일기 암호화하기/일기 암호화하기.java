import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        boolean[] alp = new boolean[26];

        for (char c : str.toCharArray()) {
            if (!alp[c - 'A']) sb.append(c);
            alp[c - 'A'] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!alp[i]) { sb.append((char) (i + 'A')); }
        }

        char[] cryptogram = (sb.toString()).toCharArray();
        sb.setLength(0);

        String target = br.readLine();

        for (char c : target.toCharArray()) {
            sb.append(cryptogram[c - 'A']);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}