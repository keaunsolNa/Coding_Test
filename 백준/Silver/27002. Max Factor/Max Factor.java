import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max = 1, ans = 1;
        while (n --> 0) {

            int target = Integer.parseInt(br.readLine());
            HashSet<Integer> set = new HashSet<>();

            solution(target, set);

            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            if (list.isEmpty()) continue;

            if (max < list.get(list.size() - 1)) {
                ans = target;
                max = list.get(list.size() - 1);
            }


        }

        System.out.println(ans);

    }


    // 소인수 분해
    public static void solution(Integer n, HashSet<Integer> hashSet) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                hashSet.add(i);
                n /= i;
            }
        }

        if (n != 1) hashSet.add(n);
    }

}