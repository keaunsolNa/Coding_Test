import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        String answer = br.readLine();
        int len = answer.length();
        boolean ans = true;

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String check = st.nextToken();

            if (check.equals("ALLOWED"))
            {
                if (!answer.equals(input))
                {
                    if (len == input.length())
                    {
                        int count = 0;
                        for (int i = 0; i < answer.length(); i++)
                        {
                            if (answer.charAt(i) != input.charAt(i))
                            {
                                count++;
                            }
                        }
                        if (count > 1)
                        {
                            ans = false;
                            break;
                        }
                    }
                    else
                    {
                        ans = false;
                        break;
                    }
                }
            }

            else
            {

                if (answer.equals(input))
                {
                    ans = false;
                    break;
                }
                else if (answer.length() == input.length())
                {
                    int count = 0;
                    for (int i = 0; i < answer.length(); i++)
                    {
                        if (answer.charAt(i) != input.charAt(i)) {
                            count++;
                        }
                    }
                    if (count <= 1)
                    {
                        ans = false;
                        break;
                    }
                }
            }
        }

        bw.write(ans ? "SYSTEM SECURE" : "INTEGRITY OVERFLOW");
        bw.flush();
        bw.close();
        br.close();

    }

}
