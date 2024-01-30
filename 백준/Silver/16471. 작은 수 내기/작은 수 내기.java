import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Integer[] arr2 = new Integer[n];
        for(int i = 0; i < n; i++) arr2[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int winPoint = (n + 1) / 2;
        int point = 0;

        int idx = 0;

        for(int i = 0; i < n; i++) {

            for(int j = idx; j < n; j++) {

                if(arr[i] < arr2[j]) {
                    point++;
                    idx = j + 1;
                    break;
                }
            }

            if(point == winPoint) break;
        }

        System.out.println(point == winPoint ? "YES" : "NO");
    }


}