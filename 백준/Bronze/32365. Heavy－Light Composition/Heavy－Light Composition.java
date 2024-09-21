import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for (int i = 0;  i < t; i++) {

            char[] arr = br.readLine().toCharArray();
            int[] alp = new int[26];

            for (char c : arr)
            {
                alp[c - 'a']++;
            }

            boolean check = true;
            boolean flag = alp[arr[0] - 'a'] > 1;
            for (int j = 1; j < n; j++)
            {

                if (alp[arr[j] - 'a'] > 1)
                {
                    if (flag)
                    {
                        check = false;
                        break;
                    }

                    else
                    {
                        flag = true;
                    }
                }
                else
                {

                    if (flag)
                    {
                        flag = false;
                    }
                    else
                    {
                        check = false;
                        break;
                    }
                }
            }

            bw.write(check ? "T" : "F");
            bw.write("\n");
        }


        bw.flush();
        bw.close();
        br.close();

    }

}
