import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String a = br.readLine();
        String b = br.readLine();
        int len = a.length();

        a += b;

        char[] str = a.toCharArray();
        Arrays.sort(str);

        String sort = new String(str);
        System.out.println(sort.substring(0, len));

    }

}