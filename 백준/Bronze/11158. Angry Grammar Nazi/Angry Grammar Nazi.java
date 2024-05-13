import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {

            st = new StringTokenizer(br.readLine());
            List<String> list = new ArrayList<>();
            while (st.hasMoreTokens()) list.add(st.nextToken());

            int cnt = 0;
            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).equals("u") || list.get(i).equals("ur")) cnt++;
                else if (list.get(i).contains("lol")) cnt++;
                else if (list.get(i).equals("would") || list.get(i).equals("should")) {

                    if (i + 1 < list.size() && list.get(i + 1).equals("of")) cnt++;
                }
            }

            System.out.println(cnt * 10);

        }
    }
}
