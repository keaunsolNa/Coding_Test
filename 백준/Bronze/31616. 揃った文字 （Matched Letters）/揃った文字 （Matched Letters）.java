import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] temp = br.readLine().toCharArray();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(temp[i]);

        System.out.println(set.size() == 1 ? "Yes" : "No");

    }
}
