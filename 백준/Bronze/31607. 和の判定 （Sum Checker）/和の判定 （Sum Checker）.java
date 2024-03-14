import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        System.out.println(arr[0] + arr[1] == arr[2] ? 1 : 0);

    }

}
