import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            StringBuilder num1 = new StringBuilder(st.nextToken());
            StringBuilder num2 = new StringBuilder(st.nextToken());

            int num = Integer.parseInt(num1.reverse().toString()) + Integer.parseInt(num2.reverse().toString());

            int answer = Integer.parseInt(new StringBuilder(num + "").reverse().toString());

            System.out.println(answer);
        }

    }


}