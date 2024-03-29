import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2001];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) arr[Integer.parseInt(st.nextToken())]++;

        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < 2001; i++) {

            if (arr[i] != 0 && arr[i] < min) {

                min = arr[i];
                idx = i;
            }
        }
        System.out.println(idx);

    }


}