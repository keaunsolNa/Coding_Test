import java.io.*;
import java.util.*;

public class Main {

    private static class Question implements Comparable<Question>{

        int difficulty;
        int needTime;

        public Question(int difficulty, int needTime) {
            this.difficulty = difficulty;
            this.needTime = needTime;
        }

        @Override
        public int compareTo(Question o) {

            if (this.difficulty == o.difficulty) return this.needTime - o.needTime;
            return this.difficulty - o.difficulty;
        }

    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for (int i = 1; i <= 5; i++) arr[i] = Integer.parseInt(st.nextToken());

        Map<Integer, PriorityQueue<Question>> map = new HashMap<>();

        for (int i = 1; i <= 5; i++) map.put(i, new PriorityQueue<>());

        for (int i = 0 ; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            int difficulty = Integer.parseInt(st.nextToken());
            int needTime = Integer.parseInt(st.nextToken());

            map.get(difficulty).add(new Question(difficulty, needTime));

        }

        long total = 0;
        for (int key : map.keySet()) {


            PriorityQueue<Question> pq = map.get(key);
            Question question = pq.poll();
            total += question.needTime;
            int prev = question.needTime;
            arr[key]--;

            while (arr[key] != 0 && !pq.isEmpty()) {

                Question question1 = pq.poll();
                total += question1.needTime;
                total += Math.abs(question1.needTime - prev);
                prev = question1.needTime;
                arr[key]--;

            }

            total += 60;

        }

        System.out.println(total - 60);
    }
}
