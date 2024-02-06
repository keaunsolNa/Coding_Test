import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if(a == 0 && d == 0) break;

            int[] arr = new int[a];
            int[] arr2 = new int[d];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < a; i++) arr[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < d; i++) arr2[i] = Integer.parseInt(st.nextToken());

            Arrays.sort(arr);
            Arrays.sort(arr2);

            int offside = arr2[1];

            boolean chk = false;
            for(int i = 0; i < a; i++)
                if(arr[i] < offside) { chk = true; break; }


            System.out.println(chk ? "Y" : "N");
        }
    }

}