import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int ans = 0;
        Stack<Character> stack = new Stack<>();
        for (char c : input) {

            if (stack.isEmpty()) stack.add(c);
            else {

                if (stack.peek() != c) {
                    stack.pop();
                    ans++;
                } else { stack.pop(); stack.add(c); }
            }
        }

        System.out.println(ans);
    }
}