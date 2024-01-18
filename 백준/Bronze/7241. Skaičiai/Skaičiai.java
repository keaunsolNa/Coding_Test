import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();

        String number = br.readLine();
        String[] arr = new String[6];

        arr[0] = a + b + c;
        arr[1] = a + c + b;
        arr[2] = b + a + c;
        arr[3] = b + c + a;
        arr[4] = c + a + b;
        arr[5] = c + b + a;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(number)) System.out.println(i + 1);
        }


    }
}