import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) arr[i] = read();

        int max = 0;
        for (int i = 0; i < 8; i++) {
            int sum = 0;
            for (int j = i + 3; j >= i; j--) sum += arr[j % 8];
            max = Math.max(max, sum);
        }

        bw.write(String.valueOf(max));
        bw.flush();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }

}