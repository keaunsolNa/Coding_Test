import java.io.*;
import java.util.*;

public class Main {

    private static int total;
    private static int prev, p, w;
    private static boolean[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        p = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        char[] str = br.readLine().toCharArray();
        arr = new boolean[10];
        prev = 9;
        total = 0;

        for (int i = 0; i < str.length; i++) {

            char temp = str[i];
            switch (temp) {

                case 'C' : total += p;
                case 'B' : total += p;
                case 'A' :

                    check(0);
                    break;

                case 'F' : total += p;
                case 'E' : total += p;
                case 'D' :

                    check(1);
                    break;

                case 'I' : total += p;
                case 'H' : total += p;
                case 'G' :

                    check(2);
                    break;

                case 'L' : total += p;
                case 'K' : total += p;
                case 'J' :

                    check(3);
                    break;

                case 'O' : total += p;
                case 'N' : total += p;
                case 'M' :

                    check(4);
                    break;

                case 'S' : total += p;
                case 'R' : total += p;
                case 'Q' : total += p;
                case 'P' :

                    check(5);
                    break;

                case 'V' : total += p;
                case 'U' : total += p;
                case 'T' :

                    check(6);
                    break;

                case 'Z' : total += p;
                case 'Y' : total += p;
                case 'X' : total += p;
                case 'W' :

                    check(7);
                    break;

                default: check(8);
                break;
            }
        }

        System.out.println(total);
    }

    private static void check (int target) {

        total += p;
        if (arr[target] && prev != 8) total += w;
        else {
            arr[prev] = false;
            arr[target] = true;
        }

        prev = target;

    }
}
