import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = Integer.parseInt(st.nextToken());
        boolean flag = false;
        int[] number = new int[2];
        int term = 0, startIdx = 0;

        for (int i = 0; i < 10; i++) {

            if(arr[i] == 0) continue;
            if (flag) {
                number[1] = arr[i];
                term = i - term;
                break;
            }
            else {
                number[0] = arr[i];
                flag = true;
                term = i;
                startIdx = i;
            }
        }

        int idx = 0;
        boolean cant = false;

        if (number[0] > number[1])
            while (true) {
                if (number[0] + (term * idx--) == number[1]) break;
                if (number[0] + (term * idx) < number[1]) {cant = true; break; }
            }

        else if (number[1] > number[0])
            while (true) {
                if(number[0] + (term * idx++) == number[1]) break;
                if (number[0] + (term * idx) > number[1]) {cant = true; break; }
            }

        if(cant) System.out.println(-1);
        else {

            idx = idx + (Integer.compare(number[0], number[1]));


            for (int i = startIdx - 1; i >= 0; i--)
                arr[i] = arr[i + 1] - idx;

            for (int i = startIdx + 1; i < 10; i++)
                arr[i] = arr[i - 1] + idx;

            for (int i = 0; i < 10; i++)
                sb.append(arr[i]).append(" ");

            System.out.println(sb);
        }
    }


}