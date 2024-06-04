import java.util.*;
import java.io.*;

public class Main {

    private static class Person {

        private final int number;
        private final int hab;
        private final int gob;

        public Person (String number, String a, String b, String c) {

            this.number = Integer.parseInt(number);
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            int c1 = Integer.parseInt(c);
            this.hab = a1 + b1 + c1;
            this.gob = a1 * b1 * c1;

        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            people[i] = new Person(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
        }

        Arrays.sort(people, (o1, o2) -> {
            if (o1.gob == o2.gob) {

                if (o1.hab == o2.hab) return Integer.compare(o1.number, o2.number);
                return Integer.compare(o1.hab, o2.hab);
            }
            return Integer.compare(o1.gob, o2.gob);
        });

        System.out.println(people[0].number + " " + people[1].number + " " + people[2].number);
    }


}
