import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] arr2 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        boolean chk = true;
        for(int i = 0; i < n; i++) {

            if(arr[i] > arr2[i]) { chk = false; break; }
        }

        System.out.println(chk ? "DA" : "NE");
    }

}