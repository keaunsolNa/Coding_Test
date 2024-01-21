import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[3];
        arr[0] = Long.parseLong(st.nextToken());
        arr[1] = Long.parseLong(st.nextToken());
        arr[2] = Long.parseLong(st.nextToken());
        
        Arrays.sort(arr);

        System.out.println(arr[1]);


    }
}