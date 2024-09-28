import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Boolean> map = new HashMap<>();
        list.add(0);
        map.put(0, true);
        for (int i = 1; i < n + 1; i++)
        {
            int temp = list.get(i - 1) - i;
            if (temp < 0 || map.containsKey(temp)) temp = list.get(i - 1) + i;
            list.add(temp);
            map.put(temp, true);
        }

        bw.write(String.valueOf(list.get(n)));
        bw.flush();
        bw.close();
        br.close();

    }

}
