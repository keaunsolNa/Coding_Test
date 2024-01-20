import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[n];
        for(int i = 0; i < n; i++) arr[i] = st.nextToken();

        Arrays.sort(arr, ((x, y) -> (y + x).compareTo(x + y)));
        for(String s : arr) sb.append(s);

        if(sb.charAt(0) == '0') System.out.println(0);
        else System.out.println(sb);
    }
}