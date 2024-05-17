import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), ".");

        while (st.hasMoreTokens()) {

            StringTokenizer st2 = new StringTokenizer(st.nextToken());
            String[] arr = new String[st2.countTokens()];

            for (int i = arr.length - 1; i >= 0; i--) arr[i] = st2.nextToken();

            for (int i = 0; i < arr.length; i++) sb.append(arr[i]).append(" ");

            sb.insert(sb.length() - 1, ".");
        }

        System.out.println(sb);

    }

}
