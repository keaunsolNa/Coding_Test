import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int l = Integer.parseInt(br.readLine());
        int needLevel = 250 - l;

        int needExperience = needLevel * 100;
        int ans = 0;
        int check = 0;

        if (a >= b && a >= c)
        {
            ans = needExperience % a == 0 ? needExperience / a : needExperience / a + 1;
        }
        else if (b >= a && b >= c)
        {
            while (needExperience > 0 && s > 0)
            {
                ans++;
                check++;
                if (check % 30 == 0) s--;
                needExperience -= b;
            }

            if (needExperience > 0 && c >= a)
            {
                check = 0;
                while (needExperience > 0 && v > 0)
                {
                    ans++;
                    check++;
                    if (check % 30 == 0) v--;
                    needExperience -= c;
                }

			}
			if (needExperience > 0)
			{
				ans += needExperience % a == 0 ? needExperience / a : needExperience / a + 1;
			}
		}

        else
        {
			while (needExperience > 0 && v > 0)
            {

                ans++;
                check++;
                if (check % 30 == 0) v--;
                needExperience -= c;
            }

            if (needExperience > 0 && b >= a)
            {

                while (needExperience > 0 && s > 0)
                {
                    ans++;
                    check++;
                    if (check % 30 == 0) s--;
                    needExperience -= b;
                }
			}
			if (needExperience > 0)
			{
				ans += needExperience % a == 0 ? needExperience / a : needExperience / a + 1;
			}
		}

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }


}