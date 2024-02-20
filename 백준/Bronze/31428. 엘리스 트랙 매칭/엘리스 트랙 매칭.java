import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[4];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {

            char temp = st.nextToken().charAt(0);

            if(temp == 'C') arr[0]++;
            else if(temp == 'S') arr[1]++;
            else if(temp == 'I') arr[2]++;
            else arr[3]++;

        }

        char target = br.readLine().charAt(0);
        System.out.println(target == 'C' ? arr[0] : target == 'S' ? arr[1] : target == 'I' ? arr[2] : arr[3]);

    }
}