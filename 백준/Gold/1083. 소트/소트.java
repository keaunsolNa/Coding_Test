import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) list.add(Integer.parseInt(st.nextToken()));

        int s = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {

            if(s == 0) break;
            int max = 0;
            int idx = -1;
            for(int j = i + 1; j < n; j++) {

                if(list.get(i) < list.get(j) && s >= j - i) {

                    if(list.get(j) > max) {
                        max = list.get(j);
                        idx = j;
                    }
                }

            }
            if(idx != -1) {

                list.remove(idx);
                list.add(i, max);
                s -= idx - i;
            }
        }

        for(int i : list) System.out.print(i + " ");

    }

}