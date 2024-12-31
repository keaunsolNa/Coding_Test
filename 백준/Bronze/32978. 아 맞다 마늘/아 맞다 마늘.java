import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            list.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++)
        {
            String target = st.nextToken();
            list.remove(target);
        }

        bw.write(list.get(0));
        bw.flush();
        bw.close();
        br.close();

    }

}
