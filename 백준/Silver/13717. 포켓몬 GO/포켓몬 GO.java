import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int max = 0;
        String ans = "";

        for (int i = 0; i < n; i++) {

            String name = br.readLine();
            st = new StringTokenizer(br.readLine());
            int need = Integer.parseInt(st.nextToken());
            int have = Integer.parseInt(st.nextToken());
            int target = 0;

            while (need <= have) {
                have -= need;
                have += 2;
                sum++;
                target++;
            }

            if (max < target) {

                max = target;
                ans = name;
            }

        }

        System.out.println(sum);
        System.out.println(ans);

    }

}
