import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String cowStr = br.readLine();
        String str = br.readLine();
        int cnt = 0;
        int idx = 0;

        while (idx < str.length()) {

            ++cnt;

            for (int i = 0; i < cowStr.length(); i++) {

                if (cowStr.charAt(i) == str.charAt(idx)) ++idx;
                if (idx == str.length()) break;
            }
        }

        System.out.println(cnt);
    }


}