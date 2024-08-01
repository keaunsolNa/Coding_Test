import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        String input = "";
        int word = 0, bs = 0;
        Set<String> set = new HashSet<>();
        while ((input = br.readLine()) != null)
        {
            String token = input.replaceAll("[^a-zA-Z]", " ").toUpperCase();

            for (String tokens : token.split(" "))
            {
                if (tokens.equals("BULLSHIT"))
                {
                    bs++;
                    word += set.size();
                    set.clear();
                }
                else if (!tokens.isEmpty())
                {
                    set.add(tokens);
                }
            }
        }

        int gcd = gcd(word, bs);
        System.out.println((word / gcd) + " / " + bs / gcd);

    }

    public static int gcd(int a, int b) {
        while(b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return a;
    }

}

