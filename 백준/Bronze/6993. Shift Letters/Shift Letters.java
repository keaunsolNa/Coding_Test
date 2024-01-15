import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());

            String origin = st.nextToken();
            int shift = Integer.parseInt(st.nextToken());

            sb.append("Shifting ").append(origin).append(" by ").append(shift).append(" positions gives us: ");

            char[] temp = origin.toCharArray();

            for(int i = 0; i < origin.length(); i++) {

                temp[i] = i - shift >= 0 ? origin.charAt(i - shift) : temp[(origin.length() - shift + i) % origin.length()];
                sb.append(temp[i]);

            }

            sb.append("\n");

            answer.append(sb);

        }

        System.out.print(answer);

    }

}