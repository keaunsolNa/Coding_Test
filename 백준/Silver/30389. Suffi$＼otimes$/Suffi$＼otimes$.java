import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        Map<String, Boolean> suffix = new HashMap<>();
        for(int i = s.length() - 1; i >= 0; i--) suffix.put(s.substring(i), true);
        n--;

        while(n --> 0) {

            String str = br.readLine();
            for(int i = str.length() - 1; i >= 0; i--) {
                String key = str.substring(i);
                if(suffix.containsKey(key)) {
                    suffix.remove(key);
                } else {
                    suffix.put(key, true);
                }
            }

        }

        System.out.println(suffix.size());

    }

}