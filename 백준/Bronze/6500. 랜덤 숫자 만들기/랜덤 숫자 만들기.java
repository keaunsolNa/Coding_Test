import java.io.*;
import java.util.*;

public class Main {

    private static int N = 4;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {

            int a = Integer.parseInt(br.readLine());
            if(a == 0) break;

            List<Integer> list = new ArrayList<>();
            list.add(a);
            while(true) {

                StringBuilder temp = new StringBuilder(a * a + "");
                while(temp.length() < 8) temp.insert(0, "0");

                a = Integer.parseInt(temp.substring(2, 6));
                if(list.contains(a)) break;
                else list.add(a);

            }

            System.out.println(list.size());
        }

    }
}