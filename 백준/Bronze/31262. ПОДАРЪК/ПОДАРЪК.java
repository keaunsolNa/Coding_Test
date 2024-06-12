import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int[] arr1 = new int[3];
        char[] arr2 = new char[3];

        for (int i = 0; i < 6; i++) {

            if (i < 3) arr2[i] = arr[i];
            else arr1[i - 3] = arr[i] - 48;

        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.print("" + arr2[0] + arr1[2] + arr2[1] + arr1[1] + arr2[2] + arr1[0]);

    }


}