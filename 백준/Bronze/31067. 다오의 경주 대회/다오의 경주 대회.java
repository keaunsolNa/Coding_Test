import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] track = new long[n];
        for(int i = 0; i < n; i++) track[i] = Integer.parseInt(st.nextToken());

        long prev = track[0];
        int cnt = 0;
        for(int i = 1; i < n; i++) {

            if(prev >= track[i]) {

                if(track[i] + k <= prev) {
                    System.out.println(-1);
                    return;
                }

                else {
                    track[i] += k;
                    cnt++;
                    prev = track[i];
                }

            }

            else prev = track[i];
        }

        System.out.println(cnt);
    }
}