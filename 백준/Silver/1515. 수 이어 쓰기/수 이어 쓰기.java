import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nums = br.readLine().trim();
        int n = 0;
        int idx = 0;

        while (true)
        {
            n += 1;
            String nStr = String.valueOf(n);
            for (int i = 0; i < nStr.length(); i++)
            {
                if (nums.charAt(idx) == nStr.charAt(i))
                {
                    idx += 1;
                    if (idx >= nums.length())
                    {
                        System.out.println(n);
                        return;
                    }
                }
            }
        }


    }

}
