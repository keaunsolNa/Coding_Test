import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int a3 = Integer.parseInt(br.readLine());
        int a4 = Integer.parseInt(br.readLine());

        System.out.println(
            Math.max(Math.min(a1, a2) * Math.min(a3, a4), Math.max(Math.min(a1, a3) * Math.min(a2, a4),
            Math.max(Math.min(a1, a4) * Math.min(a2, a3), Math.max(Math.min(a2, a3) * Math.min(a1, a4),
            Math.max(Math.min(a2, a4) * Math.min(a1, a3), Math.min(a3, a4) * Math.min(a1, a2))))))
        );
    }

}