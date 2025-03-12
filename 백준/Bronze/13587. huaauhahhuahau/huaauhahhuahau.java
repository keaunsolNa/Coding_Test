import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        char[] arr = br.readLine().toCharArray();
        StringBuilder vowel = new StringBuilder();

        for (char c : arr)
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vowel.append(c);
            }
        }

        boolean flag = true;
        for (int i = 0; i < vowel.length(); i++)
        {
            if (vowel.charAt(i) != vowel.charAt(vowel.length() - i - 1))
            {
                flag = false;
                break;
            }
        }

        bw.write(flag ? "S" : "N");
        bw.flush();
        br.close();
        bw.close();
    }

}