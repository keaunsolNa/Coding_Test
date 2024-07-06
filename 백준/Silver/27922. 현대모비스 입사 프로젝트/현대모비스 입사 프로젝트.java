import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<int[]> ability = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            ability.add(new int[]{ a, b, c });

        }

        List<int[]> origin = new ArrayList<>(ability);

        ability.sort((a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
        int first = 0;
        for (int i = 0; i < k; i++)
        {
            first += ability.get(i)[0] + ability.get(i)[1];
        }

        ability = new ArrayList<>(origin);

        ability.sort((a, b) -> (b[0] + b[2]) - (a[0] + a[2]));
        int second = 0;
        for (int i = 0; i < k; i++)
        {
            second += ability.get(i)[0] + ability.get(i)[2];
        }

        ability = new ArrayList<>(origin);

        ability.sort((a, b) -> (b[1] + b[2]) - (a[1] + a[2]));
        int third = 0;
        for (int i = 0; i < k; i++)
        {
            third += ability.get(i)[1] + ability.get(i)[2];
        }


        int result = Math.max(first, Math.max(second, third));
        System.out.println(result);
    }
}