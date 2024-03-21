import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();

        int cnt = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {

            if(input[i] == 'o') cnt++;
            else cnt = 0;

            if(cnt == 3) flag = true;

        }

        System.out.println(flag ? "Yes" : "No");

    }


}