import java.io.*;
import java.util.*;

public class Main {

    private static int[] box;
    private static String[] ans;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        char[] arr = br.readLine().toCharArray();
        box = new int[3];
        Arrays.fill(box, k);
        ans = new String[3];
        Arrays.fill(ans, "");

        for (char c : arr)
        {

            switch (c)
            {
                case 's' :
                    solve(0, "s");
                    break;
                case 'r' :
                    solve(1, "r");
                    break;
                case 'p' :
                    solve(2, "p");
                    break;
            }
        }

        for (int i = 0; i < 3; i++)
        {
        	
        	if (!ans[i].equals(""))
        	{
        		bw.write(ans[i]);
        	}
        	
        	if (i <= 1) bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve(int num, String target)
    {
        if (box[num] > 0)
        {
            box[num]--;
            ans[num] = ans[num] + target;
            return;
        }

        if (num == 2)
        {
            num = 0;
        }
        else num++;

        solve(num, target);
    }

}
