import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

        int n = Integer.parseInt(br.readLine());
        Stack<Long> stack = new Stack<>();
        Long register = 0L;
        Map<Integer, String> map = new HashMap<>();
        int orderNumber = 0;
        StringTokenizer st;

        while (n-- > 0)
        {
            map.put(orderNumber++, br.readLine());
        }


        int number = 0;
        while (!map.isEmpty()) {

            String str = map.get(number);
            st = new StringTokenizer(str, " ");
            String order = st.nextToken();

            switch (order)
            {

                case "PUSH" :
                    stack.push(Long.parseLong(st.nextToken()));
                    break;
                case "STORE" :
                    register = stack.pop();
                    break;
                case "LOAD" :
                    stack.push(register);
                    break;
                case "PLUS" :
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "TIMES" :
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "IFZERO" :
                    int num = Integer.parseInt(st.nextToken());

                    if (stack.pop() != 0)
                    {
                        break;
                    }
                    else
                    {
                        number = num;
                        continue;
                    }
                case "DONE" :
                    bw.write(String.valueOf(stack.pop()));
                    return;
            }

            number++;
        }
    }


}