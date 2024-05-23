import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = br.readLine().length() - 3;

        sb.append("AW".repeat((n + 1) / 2));
        if (sb.length() == n) sb.append("A");
        sb.append("HOO");

        System.out.println(sb);

    }

}
