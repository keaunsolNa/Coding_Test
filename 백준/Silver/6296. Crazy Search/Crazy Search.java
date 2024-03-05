import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int nc = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= input.length() - n; i++) {
            String temp = input.substring(i, i + n);
            set.add(temp);
        }


        System.out.println(set.size());

    }



}
