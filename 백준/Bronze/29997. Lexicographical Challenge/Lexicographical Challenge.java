import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder str = new StringBuilder(br.readLine());
        int k = Integer.parseInt(br.readLine());

        List<List<Character>> strList = new ArrayList<>();
        int max = str.length() % k == 0 ? str.length() / k : str.length() / k + 1;

        for (int i = 0; i < k; i++)
        {

            List<Character> list = new ArrayList<>();
            for (int j = i; j < str.length(); j += k)
            {
                list.add(str.charAt(j));
            }

            Collections.sort(list);
            strList.add(list);
        }

        StringBuilder sb = new StringBuilder();
        for (int in = 0; in < max; in++)
        {

            for (List<Character> characters : strList) {
                if (characters.size() > in) {
                    sb.append(characters.get(in));
                }
            }

        }

        System.out.println(sb);
    }
}

