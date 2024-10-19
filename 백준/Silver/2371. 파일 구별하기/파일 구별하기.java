import java.io.*;
import java.util.*;

public class Main {

    private static final List<List<Integer>> lists = new ArrayList<>();
    private static final Set<Integer> set = new HashSet<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            while (true)
            {

                int temp = Integer.parseInt(st.nextToken());
                if (temp == -1) break;
                list.add(temp);
            }

            lists.add(list);
        }

        int k = 0;
        while(!solve(k++)) set.clear();

        bw.write(String.valueOf(k));
        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean solve(int k)
    {
        for (List<Integer> list : lists)
        {

            if (k < list.size())
            {
                if (set.contains(list.get(k))) return false;
                set.add(list.get(k));
            }
        }

        return true;
    }

}
