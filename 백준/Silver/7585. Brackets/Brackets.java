import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true)
        {

            String str = br.readLine();
            if (str.equals("#")) break;
            char[] arr = str.replaceAll("[^(){}\\[\\]]", "").toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;

            for (char c : arr)
            {
                if (!stack.isEmpty())
                {

                    if (c == '(' || c == '[' || c == '{')
                    {
                        stack.push(c);
                    }

                    else if((stack.peek() == '(' && c == ')') || (stack.peek() == '[' && c == ']') || (stack.peek() == '{' && c == '}'))
                    {
                        stack.pop();
                    }

                    else
                    {
                        flag = false;
                        break;
                    }

                }
                else stack.push(c);
            }

            if (!stack.isEmpty()) flag = false;
            sb.append(flag ? "Legal" : "Illegal").append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
