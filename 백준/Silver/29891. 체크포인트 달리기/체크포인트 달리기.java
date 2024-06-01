import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Long> listPosit = new ArrayList<>();
        List<Long> listNegative = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            long temp = Long.parseLong(br.readLine());
            if (temp > 0) listPosit.add(temp);
            else if (temp < 0) listNegative.add(temp);

        }

        listPosit.sort(Collections.reverseOrder());
        Collections.sort(listNegative);

        long total = 0;

        for (int i = 0; i < listPosit.size(); i += k) total += listPosit.get(i);
        for (int i = 0; i < listNegative.size(); i += k) total += Math.abs(listNegative.get(i));

        System.out.println(total * 2);
    }


}
