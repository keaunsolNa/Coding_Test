import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] nameArr = new String[n];

        for (int i = 0; i < n; i++) nameArr[i] = br.readLine();

        for (String name : nameArr) {

            System.out.println("? " + name);
            System.out.println();
            System.out.flush();

            int answer = Integer.parseInt(br.readLine());

            System.out.println("? " + name);
            System.out.println();
            System.out.flush();

            if(answer != Integer.parseInt(br.readLine())) {
                System.out.println("! " + name);
                System.out.flush();
                System.exit(0);
            }
        }

    }
}