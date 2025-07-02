import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int flip = 0;
        int bAfter = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'B') {
                bAfter++;
            } else if (s.charAt(i) == 'D') {
                if (bAfter > 0) {
                    flip++;
                    bAfter--;  // 이 B와 D를 페어링해 해결
                }
            }
        }

        System.out.println(flip);
    }
}
