import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int q = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        Stack<Integer[]> orderList = new Stack<>();

        while (q --> 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken());
            switch (query) {

                case 1:

                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    orderList.add(new Integer[]{ 1, num });
                    break;

                case 2 :

                    orderList.add(new Integer[]{ 2, stack.pop() });
                    break;

                case 3 :

                    int num2 = Integer.parseInt(st.nextToken());
                    while (num2 --> 0)
                    {
                        Integer[] arr = orderList.pop();
						assert arr != null;
						if (arr[0] == 1) stack.pop();
                        else stack.push(arr[1]);
                    }
                    break;

                case 4 :

                    bw.write(stack.size() + "\n");
                    break;

                case 5 :

                    bw.write(stack.isEmpty() ? "-1\n" : stack.peek() + "\n");
                    break;
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}