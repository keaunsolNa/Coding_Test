import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr, Collections.reverseOrder());

        int hab = 0;
        int sub = 0;
        boolean flag = false;

        for(int i = 0; i < n; i++) {

            if(arr[i] % 2 == 0) hab += arr[i];

            else {

                sub += arr[i];

                if(flag) {

                    hab += sub;
                    sub = 0;
                    flag = false;

                } else {

                    flag = true;

                }
            }
        }

        System.out.println(hab / 2);


    }
}