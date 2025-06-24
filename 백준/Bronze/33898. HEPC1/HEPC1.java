import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();

        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(1);
        char ch3 = str2.charAt(0);
        char ch4 = str2.charAt(1);

        boolean flag = false;

        switch (ch1)
        {
            case 'H' :
                if (ch2 == 'E' && ch4 == 'P' && ch3 == 'C') flag = true;
                if (ch3 == 'E' && ch4 == 'P' && ch2 == 'C') flag = true;
                break;

            case 'E' :
                if (ch2 == 'H' && ch4 == 'C' && ch3 == 'P') flag = true;
                if (ch3 == 'H' && ch4 == 'C' && ch2 == 'P') flag = true;
                break;

            case 'P' :
                if (ch2 == 'E' && ch4 == 'H' && ch3 == 'C') flag = true;
                if (ch3 == 'E' && ch4 == 'H' && ch2 == 'C') flag = true;
                break;

            case 'C' :
                if (ch2 == 'P' && ch4 == 'E' &&  ch3 == 'H') flag = true;
                if (ch3 == 'P' && ch4 == 'E' &&  ch2 == 'H') flag = true;

        }

        bw.write(flag ? "YES" : "NO");
        bw.flush();
        bw.close();
        br.close();

    }


}