import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            int token = Integer.parseInt(st.nextToken());
            boolean flag = true;
            char[] input = st.nextToken().toCharArray();

            Stack<Character> stack = new Stack<>();

            for (char c : input)
            {

                if (stack.isEmpty())
                {

                    if (c == '>')
                    {
                        stack.push(c);
                    }
                    else
                    {
                        flag = false;
                        break;
                    }

                }

                else if (stack.peek() == '>')
                {

                    if (c == '>')
                    {
                        stack.push(c);
                    }
                    else
                    {
                        stack.pop();
                    }

                }

                else
                {
                    flag = false;
                    break;
                }
            }

            if (!stack.isEmpty())
            {
                flag = false;
            }

            if (flag) bw.write("legal\n");
            else bw.write("illegal\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
