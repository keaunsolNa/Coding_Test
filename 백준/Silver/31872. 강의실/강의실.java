import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] room = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) room[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(room);

        int[] term = new int[n];
        int position = 0;

        for (int i = 0; i < n; i++) {

            term[i] = room[i] - position;
            position = room[i];
        }

        Arrays.sort(term);
        int sum = 0;
        for (int i = 0; i < n - k; i++) sum += term[i];

        System.out.println(sum);
    }

}
