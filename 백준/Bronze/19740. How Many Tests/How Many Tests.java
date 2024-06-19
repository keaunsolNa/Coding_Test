import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        int max = 0;
        int len = 0;
        while (k --> 0) {

            String temp = br.readLine();
            max = Math.max(max, Integer.parseInt(temp));
            len = Math.max(len, temp.length());
        }

        StringBuilder maxStr = new StringBuilder();
        StringBuilder minStr = new StringBuilder();
        while (len --> 0) {
            maxStr.append("9");
            minStr.append("0");
        }

        minStr.insert(0, 1);
        minStr.deleteCharAt(minStr.length() - 1);
        System.out.println(Math.max(Integer.parseInt(minStr.toString()), max));
        System.out.print(maxStr);
    }


}