import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[16];
        for (int i = 1; i < 16; i++) {

            arr[i]++;
            if (i >= 13) arr[i]++;
        }

        st = new StringTokenizer(br.readLine());
        while (n --> 0) {

            String target = st.nextToken();
            arr[transferStringToInt(target)]--;
        }

        String ans = "TAK";
        for (int i : arr) {

            if (i > 0) {
                ans = "NIE";
                break;
            }
        }
        System.out.println(ans);

    }

    private static int transferStringToInt (String target) {

        return switch (target) {
            case "1A" -> 1;
            case "1B" -> 2;
            case "1C" -> 3;
            case "2A" -> 4;
            case "2B" -> 5;
            case "2C" -> 6;
            case "3A" -> 7;
            case "3B" -> 8;
            case "3C" -> 9;
            case "4A" -> 10;
            case "4B" -> 11;
            case "4C" -> 12;
            case "5A" -> 13;
            case "5B" -> 14;
            case "5C" -> 15;
            default -> 0;
        };
    }
}