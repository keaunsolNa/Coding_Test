import java.io.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        long total = 1;
        long floor = 1;
        int plus = 2;

        for (int a = 1; a < n; a++)
        {
            floor += plus++;
            total += floor;
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();

    }


}
