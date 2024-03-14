import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[200010];
        for (int i = 0; i < n; i++) arr[Integer.parseInt(st.nextToken())] = true;

        for (int i = 0; i <= 200001; i++) {

            if(arr[i]) {

                if(arr[i + 3] && arr[i + 6]) { System.out.println("Yes"); return; }
            }
        }

        System.out.println("No");
    }
}

