import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alp1 = new int[28];
        char[] input = br.readLine().toCharArray();

        for (char c : input) if ((int) c != 32) alp1[c - 'A']++;

        int[] alp2 = new int[28];
        input = br.readLine().toCharArray();

        for (char c : input) if ((int) c != 32) alp2[c - 'A']++;

        boolean chk = true;
        for (int i = 0; i < 28; i++) {

            if(alp1[i] != alp2[i]) {
                chk = false;
                break;
            }
        }

        System.out.println(chk ? "Is an anagram." : "Is not an anagram.");
    }
}
