import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++)
        {

            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            Map<String, Character> combine = new HashMap<>();
            for (int i = 0; i < c; i++)
            {
                char[] temp = st.nextToken().toCharArray();
                combine.put("" + temp[0] + temp[1], temp[2]);
                combine.put("" + temp[1] + temp[0], temp[2]);
            }

            int d = Integer.parseInt(st.nextToken());
            Set<String> oppose = new HashSet<>();
            for (int i = 0; i < d; i++)
            {
                char[] temp = st.nextToken().toCharArray();
                oppose.add("" + temp[0] + temp[1]);
                oppose.add("" + temp[1] + temp[0]);
            }


            int n = Integer.parseInt(st.nextToken());
            char[] input = st.nextToken().toCharArray();

            Deque<Character> dq = new ArrayDeque<>();
            for (char cc : input) {
                if (!dq.isEmpty())
                {
                    char last = dq.peekLast();
                    String combineKey = "" + last + cc;

                    if (combine.containsKey(combineKey))
                    {
                        dq.pollLast();
                        dq.addLast(combine.get(combineKey));
                        continue;
                    }

                    boolean opposed = false;
                    for (char cq : dq)
                    {
                        if (oppose.contains("" + cq + cc))
                        {
                            dq.clear();
                            opposed = true;
                            break;
                        }
                    }

                    if (opposed) continue;
                }

                dq.addLast(cc);
            }

            bw.write("Case #" + tc +": [");
            while (!dq.isEmpty())
            {
                bw.write(dq.poll());
                if (!dq.isEmpty()) bw.write(", ");
            }
            bw.write("]\n");

        }
        bw.flush();
        bw.close();
        br.close();

    }

}
