import java.io.*;
        import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String tokens = st.nextToken();

        Deque<Integer> dq = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++)
        {
            dq.add(i);
        }
        for (char c : tokens.toCharArray()) {

            if (c == '.')
            {
                while (!dq.isEmpty())
                {
                    list.add(dq.poll());
                }
                break;
            }
            if (c == 'A')
            {
                dq.addLast(dq.poll());
            }
            else if (c == 'B')
            {
                Integer first = dq.poll();
                dq.addLast(dq.poll());
                dq.addFirst(first);
            }
        }

        bw.write(list.get(k - 1) + " ");
        bw.write(list.get(k) + " ");
        bw.write(String.valueOf(list.get(k + 1)));


        bw.flush();
        bw.close();
        br.close();

    }

}
