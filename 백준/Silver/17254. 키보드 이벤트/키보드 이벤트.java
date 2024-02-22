import java.io.*;
import java.util.*;

public class Main {

    private static class Keyboard implements  Comparable<Keyboard> {

        private int keyboardName;
        private int sec;
        private String inputKey;

        public Keyboard(int keyboardName, int sec, String inputKey) {

            this.keyboardName = keyboardName;
            this.sec = sec;
            this.inputKey = inputKey;
        }

        @Override
        public int compareTo(Keyboard keyboard) {
            return this.sec == keyboard.sec ? this.keyboardName - keyboard.keyboardName : this.sec - keyboard.sec;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Keyboard> priorityQueue = new PriorityQueue<>();

        while(m --> 0) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String c = st.nextToken();

            priorityQueue.add(new Keyboard(a, b, c));
        }

        while(!priorityQueue.isEmpty())
            sb.append(priorityQueue.poll().inputKey);

        System.out.print(sb);

    }
}