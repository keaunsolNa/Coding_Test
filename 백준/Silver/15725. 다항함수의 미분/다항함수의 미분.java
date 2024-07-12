import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 2;

        if (str.charAt(0) == 'x') answer = 1;
        else if (str.charAt(0) == '-' && str.charAt(1) == 'x') answer = -1;
        else if (str.indexOf('x') == -1) answer = 0;

        if (answer != 2) {

            System.out.println(answer);
            return;

        }

        int x = str.indexOf('x');
        StringBuilder ans = new StringBuilder();
        for (int i = x - 1; i >= 0; i--)
        {

            if (str.charAt(i) == '+' || str.charAt(i) == '-')
            {
                ans.insert(0, str.charAt(i));
                break;
            }

            ans.insert(0, str.charAt(i));

        }

        System.out.println(ans);

    }
}

