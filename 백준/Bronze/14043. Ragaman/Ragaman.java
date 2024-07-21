import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        String str2 = br.readLine();

        int allowDiff = (int) str2.chars().filter(ch -> ch == '*').count();
        boolean flag = true;
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();
        int countDiff = 0;

        for (char c = 'a'; c <= 'z'; c++)
        {
            count1.put(c, 0);
            count2.put(c, 0);
        }

        for (char c : str.toCharArray())
        {
            count1.put(c, count1.get(c) + 1);
        }

        for (char c : str2.toCharArray())
        {
            if (c != '*') count2.put(c, count2.get(c) + 1);
        }

        for (char c = 'a'; c <= 'z'; c++)
        {
            if (count1.get(c) > count2.get(c)) countDiff += count1.get(c) - count2.get(c);
        }

        if (countDiff != allowDiff) flag = false;

        System.out.println(flag ? "A" : "N");
    }

}

