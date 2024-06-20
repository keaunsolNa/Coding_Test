import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        char[] code = st.nextToken().toCharArray();
        char[] guess = st.nextToken().toCharArray();

        int r = 0, s = 0;
        List<Character> cod = new ArrayList<>(), gues = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (code[i] == guess[i]) r++;

            else {
                cod.add(code[i]);
                gues.add(guess[i]);
            }

        }

        for (int i = cod.size() - 1; i >= 0; i-- ) {

            if (cod.contains(gues.get(i))) {
                s++;
                cod.remove(gues.get(i));
            }
        }

        System.out.println(r + " " + s);

    }


}