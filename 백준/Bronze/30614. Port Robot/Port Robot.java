import java.io.*;
import java.util.Stack;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        bw.write(solve() ? "1" : "0");
        bw.flush();
        bw.close();
        br.close();


    }

    private static boolean solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        char[] target = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : target)
        {

            if ((int) c >= 65 && c <= 90)
            {
                if (stack.isEmpty()) return false;
                else if (stack.pop() != c) return false;
            }

            else
            {
                stack.push((char) ((int) c - 32));
            }

        }

        return stack.isEmpty();
    }

}