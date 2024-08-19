import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        while (n --> 0)
        {

            st = new StringTokenizer(br.readLine());

            boolean addOrVote = st.nextToken().equals("Add");
            char target = st.nextToken().charAt(0);

            if (addOrVote) stack.push(target);
            else {

                if (stack.isEmpty() || stack.peek() != target)
                {
                    bw.write("No");
                    bw.flush();
                    bw.close();
                    return;
                }
                stack.pop();
            };

        }

        bw.write(stack.isEmpty() ? "Yes" : "No");
        bw.flush();
        bw.close();

    }


}
