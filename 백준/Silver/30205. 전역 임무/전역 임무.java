
import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static BufferedReader br;

    private static int N, M;
    private static long P;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input();

        bw.write(solve());
        bw.close();
    } 

    private static String solve() throws IOException {
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> pque = new PriorityQueue<>();
            int item = 0;

            for (int i = 0; i < M; i++) {
                int temp = Integer.parseInt(st.nextToken());
                if (temp == -1) {
                    item++;
                } else {
                    pque.offer(temp);
                }
            }

            while (!pque.isEmpty()) {
                while (P < pque.peek() && item > 0) {
                    item--;
                    P *= 2;
                }

                if (P < pque.peek()) {
                    return "0";
                }

                P += pque.peek();
                pque.poll();
            }

            while (item-- > 0) P *= 2;
        }

        sb.append(1);
        return sb.toString();
    }

    private static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        P = Long.parseLong(st.nextToken());
    } 
} 