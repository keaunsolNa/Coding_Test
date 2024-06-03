import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String input = "";
        while ((input = br.readLine()) != null) {

            int n = Integer.parseInt(input);
            Map<Integer, int[]> map = new HashMap<>();
            int cnt = 0;

            while (n --> 0) {

                st = new StringTokenizer(br.readLine());
                int size = Integer.parseInt(st.nextToken());
                int leftOrRight = st.nextToken().equals("D") ? 1 : 0;

                if (map.containsKey(size)) {

                    if (map.get(size)[leftOrRight == 1 ? 0 : 1] > 0) {
                        map.get(size)[leftOrRight == 1 ? 0 : 1]--;
                        cnt++;
                    }

                    else map.get(size)[leftOrRight]++;

                }

                else {

                    int[] temp = new int[2];
                    temp[leftOrRight]++;
                    map.put(size, temp);

                }
            }

            System.out.println(cnt);
        }

    }

}
