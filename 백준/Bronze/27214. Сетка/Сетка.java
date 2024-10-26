import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        int W = Integer.parseInt(br.readLine());
        int H = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());


        for (int h = 0; h < H; h++)
        {

            for (int t = 0; t < T; t++)
            {
                sb.append("*".repeat(Math.max(0, W * K + (W + 1) * T)));
                sb.append("\n");
            }

            for (int k = 0; k < K; k++)
            {

                for (int w = 0; w < W; w++)
                {
                    sb.append("*".repeat(Math.max(0, T)));
                    sb.append(".".repeat(K));
                }

                sb.append("*".repeat(Math.max(0, T)));
                sb.append("\n");
            }
        }

        for (int t = 0; t < T; t++)
        {
            sb.append("*".repeat(Math.max(0, W * K + (W + 1) * T)));
            if (t < T - 1) sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }

}
