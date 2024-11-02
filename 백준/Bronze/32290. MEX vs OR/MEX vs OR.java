import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++)
        {
            list.add(i | x);
        }

        Collections.sort(list);
        for (int i = 0; i <= list.get(list.size() - 1) + 1; i++)
        {
            if (!list.contains(i))
            {
                bw.write(String.valueOf(i));
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }


}
