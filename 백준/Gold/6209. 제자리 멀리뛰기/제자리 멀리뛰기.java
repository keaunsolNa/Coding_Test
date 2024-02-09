import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) list.add(Integer.parseInt(br.readLine()));

        int start = 0;
        int end = d;
        int result = 0;
        list.add(0);
        list.add(d);
        Collections.sort(list);

        while(start <= end) {

            int mid = (start + end) / 2;
            int sum = 0;
            int now = 0;

            for(int i = 1; i < list.size(); i++) {

                if(list.get(i) - list.get(now) < mid) sum++;
                else now = i;
            }

            if(sum > m) end = mid - 1;
            else {
                result = mid;
                start = mid + 1;
            }

        }

        System.out.println(result);

    }
}