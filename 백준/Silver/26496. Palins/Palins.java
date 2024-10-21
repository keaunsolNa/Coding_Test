import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while ((input = br.readLine()) != null)
        {

            List<String> palindromesList = new ArrayList<>();
            PriorityQueue<String> palindromesPQ = new PriorityQueue<>((o1, o2) -> {

                if (o1.length() != o2.length())
                {
                    return o1.length() - o2.length();
                }
                else
                {
                    return palindromesList.indexOf(o1) - palindromesList.indexOf(o2);
                }
            });

            for (int i = 0; i < input.length(); i++)
            {

                for (int j = i + 1; j <= input.length(); j++)
                {
                    String subStr = input.substring(i, j);
                    if (isPalindrome(subStr) && !palindromesPQ.contains(subStr))
                    {
                        palindromesList.add(subStr);
                        palindromesPQ.offer(subStr);
                    }
                }
            }

            bw.write(palindromesPQ.size() + " - ");
            while (!palindromesPQ.isEmpty())
            {
                bw.write("\"" + palindromesPQ.poll() + "\" ");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    private static boolean isPalindrome(String word) {

        for (int i = 0; i < (word.length() / 2); i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

}
