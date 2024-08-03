import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int k = Integer.parseInt(br.readLine());

        for (int i = 1; i <= k; i++)
        {

            char[] str = br.readLine().toCharArray();
            Stack<Integer> stack = new Stack<>();
            for (char c : str)
            {
                int target = c == 'u' ? 1 : c == 'd' ? -1 : c == 'l' ? 2 : -2;
                if (!stack.isEmpty())
                {
                    if (stack.peek() + target == 0) stack.pop();
                    else stack.push(target);

                }
                else stack.push(target);
            }

            sb.append("Data Set ").append(i).append(": \n");
            sb.append(stack.isEmpty() ? "Yes" : "No").append("\n");
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
