import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String[][] map = new String[10][10];
        for (int i = 0; i < 10; i++) {

            st = new StringTokenizer(br.readLine());
            Set<String> set = new HashSet<>();
            for (int j = 0; j < 10; j++) {

                map[i][j] = st.nextToken();
                set.add(map[i][j]);
            }

            if(set.size() == 1) {
                System.out.println(1);
                return;
            }
        }

        for (int i = 0; i < 10; i++) {

            Set<String> set = new HashSet<>();
            for (int j = 0; j < 10; j++)
                set.add(map[j][i]);

            if(set.size() == 1) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }


}
