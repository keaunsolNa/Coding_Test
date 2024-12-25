import java.io.*;

public class Main {

    private static int[] ans;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        ans = new int[5];
        int limit = 0;
        for (char c : input)
        {
            boolean flag = switch (c) {
                case 'R' -> {
                    solve(0);
                    yield true;
                }
                case 'K' -> {
                    solve(1);
                    yield true;
                }
                case 'T' -> {
                    solve(2);
                    yield true;
                }
                case 'S' -> {
                    solve(3);
                    yield true;
                }
                case 'A' -> {
                    solve(4);
                    yield true;
                }
                default -> false;
            };

            limit++;

            if (flag)
            {
                if (ans[0] == 1 && ans[1] == 1 && ans[2] == 1 && ans[3] == 1 && ans[4] == 2)
                {
                    break;
                }
            }
        }

        bw.write(String.valueOf(limit));
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve(int target)
    {

        if (target == 4)
        {
            if (ans[target] == 0)
            {
                ans[target] = 1;
            }
            else if (ans[target] == 1)
            {
                ans[target] = 2;
            }
        }
        else if (ans[target] == 0)
        {
            ans[target] = 1;
        }
    }
}
