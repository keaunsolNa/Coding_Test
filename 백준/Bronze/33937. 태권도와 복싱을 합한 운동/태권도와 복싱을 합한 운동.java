import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static StringBuilder temp;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        bw.write(solve());
        bw.flush();
        bw.close();
        br.close();

    }

    private static String solve() throws IOException {

        StringBuilder ans = new StringBuilder();

        temp = new StringBuilder();
        if (operation(br.readLine())) ans.append(temp);
        else
        {
            br.readLine();
            return "no such exercise";
        }

        temp = new StringBuilder();
        if (operation(br.readLine())) ans.append(temp);
        else return "no such exercise";


        return ans.toString();
    }

    private static boolean operation (String str)
    {

        boolean flag = false;

        for (char c : str.toCharArray()) {

            switch (c)
            {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :

                    flag = true;
                    temp.append(c);
                    break;

                default:

                    if (!flag) temp.append(c);
                    else return true;
            }
        }

        return false;
    }

}