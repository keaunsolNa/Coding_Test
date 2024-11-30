import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order)
            {

                case "add" :
                    int num = Integer.parseInt(st.nextToken());
                    dq.offer(num);
                    break;

                case "take" :
                    if (!dq.isEmpty()) dq.pollLast();
                    break;

                default:
                    if (dq.size() >= 2)
                    {
                        int cnt = dq.size() / 2;
                        while (cnt --> 0)
                        {
                            dq.addLast(dq.removeFirst());
                        }
                    }

            }
        }

        bw.write(dq.size() + "\n");
        while (!dq.isEmpty())
        {
            sb.append(dq.pop()).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }


}
