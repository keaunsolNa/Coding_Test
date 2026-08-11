import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int star = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * star - 1; i++) {
            if (i <= star) {
                for (int j = 1; j <= star - i; j++) {
                    sb.append(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                	sb.append("*");
                }
            }
            else {
                for (int j = 1; j <= i % star; j++) {
                	sb.append(" ");
                }
                for (int j = 1; j <= (2 * star - 1) - 2 * (i % star); j++) {
                	sb.append("*");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
	}
}
