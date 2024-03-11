import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        boolean ans = true;

        for (int i = 0; i < 3; i++) {

            st = new StringTokenizer(br.readLine());
            boolean flag = false;

            for (int j = 0; j < n; j++) {

                int temp = Integer.parseInt(st.nextToken());
                if (temp == 7) flag = true;
            }

            if(!flag) { ans = false; break; }

        }

        System.out.println(ans ? 777 : 0);


    }

}
