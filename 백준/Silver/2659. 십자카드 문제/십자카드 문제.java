import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());

        int min = getMin(arr[0], arr[1], arr[2], arr[3]);

        boolean[] clockNum = getClockNum();

        int ans = 0;

        for (int i = 1111; i <= min; i++)
            if(clockNum[i]) ans++;

        System.out.println(ans);

    }

    private static boolean[] getClockNum() {

        boolean[] visit = new boolean[10000];

        for (int a = 1; a < 10; a++) {

            for (int b = 1; b < 10; b++) {

                for (int c = 1; c < 10; c++) {

                    for(int d = 1; d < 10; d++) {

                        int n = getMin(a, b, c, d);

                        if(!visit[n]) visit[n] = true;
                    }
                }
            }
        }

        return visit;
    }

    public static int getMin(int a, int b, int c, int d) {
        int min = Integer.MAX_VALUE;

        min = Math.min(min, a * 1000 + b * 100 + c * 10 + d);
        min = Math.min(min, b * 1000 + c * 100 + d * 10 + a);
        min = Math.min(min, c * 1000 + d * 100 + a * 10 + b);
        min = Math.min(min, d * 1000 + a * 100 + b * 10 + c);

        return min;
    }
}
