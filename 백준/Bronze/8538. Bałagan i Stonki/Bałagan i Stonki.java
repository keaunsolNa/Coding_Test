import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        while (n --> 0) {

            String name = br.readLine().toUpperCase().replaceAll("-", "");
            set.add(name);

        }

        System.out.println(set.size());

    }

}
