import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());

        String[] alphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        int dia = 2*N-1;
        for (int i = r1; i < r2+1; i++) {
            for (int j = c1; j <c2+1; j++) {
                int ni = i % dia;
                int nj = j % dia;
                int dis = Math.abs(N-1-ni) + Math.abs(N-1-nj);
                if (dis > N-1) {
                    System.out.print(".");
                } else {
                    System.out.print(alphabet[dis%26]);
                }
            }

            System.out.println();
        }

    }
}