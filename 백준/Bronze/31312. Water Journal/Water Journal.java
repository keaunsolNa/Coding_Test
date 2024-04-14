import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) arr[i] = Integer.parseInt(br.readLine());

        if (!contains(arr, a)) {

            if (!contains(arr, b)) System.out.println(-1);
            else System.out.println(a);
        }

        else if (!contains(arr, b)) {
            System.out.println(b);
        }

        else {

            for (int i = a; i <= b; i++) System.out.println(i);
        }

    }

    public static boolean contains(int[] arr, int target) {

        for (int num : arr)
            if (num == target) return true;

        return false;
    }
}
