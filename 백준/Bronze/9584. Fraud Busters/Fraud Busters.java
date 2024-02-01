import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int n = Integer.parseInt(br.readLine());
        int target = 0;
        for(int t = 0; t < n; t++) {

            boolean flag = true;
            String temp = br.readLine();
            for(int i = 0; i < input.length(); i++) {

                if (input.charAt(i) != '*' && input.charAt(i) != temp.charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                target++;
                sb.append(temp).append("\n");
            }
        }

        System.out.println(target);
        System.out.print(sb);
    }
}
