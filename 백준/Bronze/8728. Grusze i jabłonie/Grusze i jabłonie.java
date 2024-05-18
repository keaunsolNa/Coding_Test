import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        List<Integer> pear = new ArrayList<>();
        List<Integer> apple = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (Integer.parseInt(st.nextToken()) == 1) apple.add(i);
            else pear.add(i);
        }

        int ans = 0;
        for (int i = 0; i < apple.size(); i++) {

            ans = Math.max(Math.abs(apple.get(i) -  pear.get(0)), Math.max(Math.abs(apple.get(i) - pear.get(pear.size() - 1)), ans));
        }

        System.out.println(ans);

    }

}
