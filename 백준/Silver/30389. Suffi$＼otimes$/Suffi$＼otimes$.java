import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> suffix = new HashSet<>();

        while(n --> 0) {

            String str = br.readLine();
            for(int i = str.length() - 1; i >= 0; i--) {
                String key = str.substring(i);
                if(suffix.contains(key)) {
                    suffix.remove(key);
                } else {
                    suffix.add(key);
                }
            }

        }

        System.out.println(suffix.size());

    }

}