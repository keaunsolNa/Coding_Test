import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class Main {

    private static class Card {
        int ans = -1;
    }


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Card> dq = new ArrayDeque<>();
        Card[] arr = new Card[n];

        for (int i = 0; i < n; i++) {

            arr[i] = new Card();
            dq.addLast(arr[i]);

        }
        for (int i = 1; i < n; i++) {

            int cnt = i % dq.size();
            while (cnt --> 0)  dq.addLast(dq.pollFirst());

            Objects.requireNonNull(dq.pollFirst()).ans = i;

        }

        Objects.requireNonNull(dq.pollFirst()).ans = n;

        for (int i = 0; i < n; i++) sb.append(arr[i].ans).append(" ");

        System.out.println(sb);

    }


}

