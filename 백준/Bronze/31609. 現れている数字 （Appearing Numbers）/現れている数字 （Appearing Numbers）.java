import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        boolean[] temp = new boolean[10];
        for (int i = 0; i < n; i++)
            temp[Integer.parseInt(st.nextToken())] = true;

        for (int i = 0; i < 10; i++) {

            if(temp[i]) System.out.println(i);
        }






    }

}
