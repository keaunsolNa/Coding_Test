import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();

        while (n --> 0)
        {

            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            map.put(str, num);
            queue.add(str);

        }

        while (queue.size() > 1)
        {
            String student = queue.poll();
            int no = map.get(student);

            for (int i = 0; i < no - 1; i++)
            {
                queue.add(queue.poll());
            }

            queue.poll();
        }

        bw.write(String.valueOf(queue.poll()));
        bw.flush();
        bw.close();
        br.close();
    }

}
