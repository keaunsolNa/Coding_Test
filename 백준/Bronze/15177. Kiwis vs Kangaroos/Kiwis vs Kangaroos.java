import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<Character, Integer> KANGAROO = new HashMap<>();
        for (char c : "KANGAROO".toCharArray())
            KANGAROO.put(c, KANGAROO.getOrDefault(c, 0) + 1);

        Map<Character, Integer> KIWIBIRD = new HashMap<>();
        for (char c : "KIWIBIRD".toCharArray())
            KIWIBIRD.put(c, KIWIBIRD.getOrDefault(c, 0) + 1);

        char[] input = br.readLine().toUpperCase().toCharArray();
        int a = 0, b = 0;

        for (char c : input) {

            if (KANGAROO.containsKey(c)) a += KANGAROO.get(c);

            if (KIWIBIRD.containsKey(c)) b += KIWIBIRD.get(c);
        }

        System.out.println(a > b ? "Kangaroos" : a < b ? "Kiwis" : "Feud continues");

    }
}