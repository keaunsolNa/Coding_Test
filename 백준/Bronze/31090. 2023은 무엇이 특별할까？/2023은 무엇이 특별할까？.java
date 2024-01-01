import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            String year = br.readLine();
            int nextYear = Integer.parseInt(year) + 1;
            String suffix = year.substring(2, 4);

            sb.append(nextYear % Integer.parseInt(suffix) == 0 ? "Good" : "Bye").append("\n");

        }

        System.out.print(sb);
    }
}