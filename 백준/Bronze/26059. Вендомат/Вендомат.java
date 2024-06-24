import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static class Money implements Comparable<Money> {
        int rubles, kopecks;

        public Money(String rublesAndKopecks) {
            final StringTokenizer tmp = new StringTokenizer(rublesAndKopecks, ",");
            this.rubles = Integer.parseInt(tmp.nextToken());
            this.kopecks = Integer.parseInt(tmp.nextToken());
        }

        @Override
        public int compareTo(Money o) {
            return this.rubles * 100 + this.kopecks - (o.rubles * 100 + o.kopecks);
        }

        public boolean withoutRemainCheck(Money chip) {
            return this.rubles >= chip.rubles && this.kopecks >= chip.kopecks;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Money total = new Money(st.nextToken());

        Money max = new Money("-1,0");
        String answer = "-1";

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            Money cur = new Money(st.nextToken());

            if (total.withoutRemainCheck(cur) && max.compareTo(cur) < 0) {
                answer = name;
                max = cur;
            }

        }

        System.out.println(answer);
    }

}