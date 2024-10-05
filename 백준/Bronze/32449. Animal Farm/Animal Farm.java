import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        int max = 0;
        while (n --> 0)
        {

            st = new StringTokenizer(br.readLine());
            String animal = st.nextToken();
            int influence = Integer.parseInt(st.nextToken());

            if (animal.equals("pig")) max = Math.max(max, influence);
            else list.add(influence);

        }

        long total = max;
        for (int influence : list)
        {
            if (influence < max) total += influence;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }


}
