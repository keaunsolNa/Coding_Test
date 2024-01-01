import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();

        stack.add(Integer.parseInt(st.nextToken()));
        n--;

        while(n --> 0) {

            int temp = Integer.parseInt(st.nextToken());
            if(!stack.isEmpty() && (stack.peek() + temp) % 2 == 0) stack.pop();
            else stack.add(temp);

        }

        System.out.println(stack.size());


    }
}