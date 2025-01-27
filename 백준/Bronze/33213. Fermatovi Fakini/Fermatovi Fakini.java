import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int even = 0;
        int odd = 0;
        List<Integer> evenNumber = new ArrayList<>();
        List<Integer> oddNumber = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0)
            {
                even++;
                evenNumber.add(num);
            }
            else
            {
                odd++;
                oddNumber.add(num);
            }

        }

        Collections.sort(evenNumber);
        Collections.sort(oddNumber);
        int ans;

        if (even > odd)
        {
            ans = 2;
            for (int i = 0; ; i++)
            {
                if (i > evenNumber.size() - 1) break;
                if (evenNumber.get(i) == ans)
                {
                    ans += 2;
                }
                else if (evenNumber.get(i) > ans) break;
            }
        }

        else
        {
            ans = 1;

            for (int i = 0; ; i++)
            {
                if (i > oddNumber.size() - 1) break;
                if (oddNumber.get(i) == ans)
                {
                    ans += 2;
                }
                else if (oddNumber.get(i) > ans) break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}
