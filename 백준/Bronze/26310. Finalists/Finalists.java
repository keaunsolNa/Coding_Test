import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> scores = new HashMap<>();

        for (int nation = 0; nation < 6; nation++)
        {

            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int pt = Integer.parseInt(st.nextToken());
            int pu = Integer.parseInt(st.nextToken());
            int rt = Integer.parseInt(st.nextToken());
            int ru = Integer.parseInt(st.nextToken());
            int f  = Integer.parseInt(st.nextToken());
            int score = pt * 56 + pu * 24 + rt * 14 + ru * 6 + f * 30;
            scores.put(name, score);

        }

        int rank = 1;
        int taiwanScore = scores.get("Taiwan");
        for (int score : scores.values())
            if (score > taiwanScore) rank++;

        int result = n / 6 + (rank <= n % 6 ? 1 : 0);
        System.out.println(result);

    }


}