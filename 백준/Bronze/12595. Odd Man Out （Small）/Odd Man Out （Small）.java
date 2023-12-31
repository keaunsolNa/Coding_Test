import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {

            int g = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            while(st.hasMoreTokens()) {

                int temp = Integer.parseInt(st.nextToken());
                if(list.contains((Object)temp)) list.remove((Object)temp);
                else list.add(temp);
            }

            System.out.println("Case #" + i + ": " + list.get(0));
        }
    }
}