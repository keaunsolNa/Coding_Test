import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            long n = Integer.parseInt(br.readLine());
            System.out.println(2 * n - 1);

        }
    }


}
