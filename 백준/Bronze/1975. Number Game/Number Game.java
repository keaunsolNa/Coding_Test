import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            int n = Integer.parseInt(br.readLine());
            long cnt = 0;
            for(int i = 2; i <= n; i++) {

                int number = n;

                while (number % i == 0) {

                    cnt++;
                    number /= i;
                }

            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}