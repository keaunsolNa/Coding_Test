import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int inTerrace = 0;
        int ans = 0;
        for (int i = 0; i < x; i++) {

            st = new StringTokenizer(br.readLine());
            boolean enterOrLeave = st.nextToken().equals("enter");
            int number = Integer.parseInt(st.nextToken());

            if (enterOrLeave) {

                if (inTerrace + number <= l) inTerrace += number;
                else ans++;
            } else inTerrace -= number;

        }

        System.out.println(ans);

    }

}
