import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int cnt = 0, max = 0;

        for (char c : input)
        {

            if (stack.isEmpty())
            {

                if (c == ')' || c == '}' || c == ']')
                {
                    System.out.println("NIE");
                    return;
                }

                stack.push(c);
                cnt++;
                max = Math.max(max, cnt);
            }
            else
            {

                switch (c)
                {
                    case '(' :
                    case '[' :
                    case '{' :
                        stack.push(c);
                        cnt++;
                        max = Math.max(max, cnt);
                        break;

                    case ')' :

                        if (stack.peek() == '(')
                        {
                            stack.pop();
                            cnt--;
                        }
                        break;

                    case ']' :

                        if (stack.peek() == '[')
                        {
                            stack.pop();
                            cnt--;
                        }
                        break;

                    case '}' :

                        if (stack.peek() == '{')
                        {
                            stack.pop();
                            cnt--;
                        }
                        break;

                }
            }

            if (stack.isEmpty())
            {
                cnt = 0;
            }

        }

        if (stack.isEmpty()) bw.write(String.valueOf(max));
        else bw.write("NIE");

        bw.flush();
        bw.close();
        br.close();

    }


}
