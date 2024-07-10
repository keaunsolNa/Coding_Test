import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Integer[] need = new Integer[n];
        int[] have = new int[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            need[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
        {
            have[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(need, Collections.reverseOrder());
        Arrays.sort(have);

        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {

            boolean flag = false;
            for (int j = 0; j < m; j++)
            {

                if (have[j] >= need[i]) {
                    have[j] = -1;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                cnt++;
                list.add(need[i]);
            }
        }

        Collections.sort(list);

        System.out.println(cnt);
        for (int i : list)
        {
            System.out.print(i + " ");
        }
    }
}

