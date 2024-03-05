import java.io.*;
import java.util.PriorityQueue;

public class Main {

    private static class CharacterArray implements Comparable<CharacterArray>{

        private final char temp;
        private final int lowerOrUpperOrNumber;

        public CharacterArray(char temp, int lowerOrUpperOrNumber) {
            this.temp = temp;
            this.lowerOrUpperOrNumber = lowerOrUpperOrNumber;
        }

        @Override
        public int compareTo(CharacterArray o) {

            if(this.lowerOrUpperOrNumber == o.lowerOrUpperOrNumber) {

                return this.temp - o.temp;

            }

            else return this.lowerOrUpperOrNumber - o.lowerOrUpperOrNumber;
        }

    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        while (true) {

            String input = br.readLine();
            if(input.equals("#")) break;

            char[] arr = input.toCharArray();
            PriorityQueue<CharacterArray> pq = new PriorityQueue<>();
            StringBuilder in = new StringBuilder();

            for (char c : arr) {

                int lowerOrUpperOrNumber = 0;

                if((int)c <= 57) lowerOrUpperOrNumber = 3;
                else if((int)c <= 90) lowerOrUpperOrNumber = 2;
                else lowerOrUpperOrNumber = 1;


                pq.add(new CharacterArray(c, lowerOrUpperOrNumber));
            }

            while (!pq.isEmpty()) in.append(pq.poll().temp);

            out.append(in).append("\n");
        }

        System.out.println(out);

    }
}
