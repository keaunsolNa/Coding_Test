import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Character> dq = new ArrayDeque<>();
        dq.addLast('A');
        dq.addLast('B');
        dq.addLast('C');
        dq.addLast('D');
        dq.addLast('E');

        while (true)
        {
            int b = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            if (b == 4 && n == 1) break;

            switch (b)
            {
                case 1 :
                {
                    while (n --> 0)
                    {
                        dq.addLast(dq.pop());
                    }
                }
                break;
                case 2 :
                {
                    while (n --> 0)
                    {
                        dq.addFirst(dq.pollLast());
                    }
                }
                break;
                case 3 :
                {
                    while (n --> 0)
                    {
                        Character temp = dq.pop();
                        Character temp2 = dq.pop();
                        dq.addFirst(temp);
                        dq.addFirst(temp2);
                    }
                    break;
                }
            }
        }

        while (!dq.isEmpty())
        {
            bw.write(dq.pop() + " ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
