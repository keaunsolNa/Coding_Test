import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[4];
        for(int i = 0; i < 4; i++) arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr, Collections.reverseOrder());

        int sum = 0;
        for(int i = 0; i < 3; i++) sum += arr[i];
        System.out.println(sum + 1);
    }
}