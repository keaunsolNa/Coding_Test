import java.io.*;
import java.util.*;

public class Main {


    private static long[] arr, minTree;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "|");

        int a = st.hasMoreTokens() ? st.nextToken().length() : 0;
        int b = st.hasMoreTokens() ? st.nextToken().length() : 0;

        st = new StringTokenizer(br.readLine(), "|");

        int c = st.hasMoreTokens() ? st.nextToken().length() : 0;
        int d = st.hasMoreTokens() ? st.nextToken().length() : 0;

        if (a == c || a == d || b == c || b == d) System.out.println("Yes");
        else System.out.println("No");


    }
}
