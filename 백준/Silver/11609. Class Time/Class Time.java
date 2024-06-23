import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    private static class Name implements Comparable<Name> {

        private final String firstName;
        private final String lastName;

        public Name (String firstName, String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public int compareTo(Name o) {

            if (this.lastName.compareTo(o.lastName) == 0)
                return this.firstName.compareTo(o.firstName);
            return this.lastName.compareTo(o.lastName);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Name> pq = new PriorityQueue<>();

        while (n --> 0) {

            st = new StringTokenizer(br.readLine());
            pq.add(new Name(st.nextToken(), st.nextToken()));
        }

        while (!pq.isEmpty()) {

            Name name = pq.poll();
            System.out.println(name.firstName + " " + name.lastName);
        }
    }


}