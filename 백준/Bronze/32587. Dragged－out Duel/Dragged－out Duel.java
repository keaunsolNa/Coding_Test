import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] me = br.readLine().toCharArray();
        char[] guile = br.readLine().toCharArray();

        int result = 0;
        for (int i = 0; i < n; i++)
        {
            result += game(me[i], guile[i]);
        }

        bw.write(result > 0 ? "victory" : "defeat");
        bw.flush();
        bw.close();
        br.close();

    }

    private static int game (char a, char b)
    {

        return switch (a) {
            case 'R' -> b == 'P' ? -1 : b == 'S' ? 1 : 0;
            case 'P' -> b == 'S' ? -1 : b == 'R' ? 1 : 0;
            case 'S' -> b == 'R' ? -1 : b == 'P' ? 1 : 0;
            default -> 0;
        };
    }
}
