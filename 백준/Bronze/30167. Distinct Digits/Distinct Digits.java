import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int ans = 0;
        Set<Character> set;

        for (int i = l; i <= r; i++) {

            set = new HashSet<>();
            char[] temp = (i + "").toCharArray();

            for (char c : temp) set.add(c);

            if (temp.length == set.size()) {
                System.out.println(i);
                return;
            }

        }

        System.out.println(-1);


    }

}
