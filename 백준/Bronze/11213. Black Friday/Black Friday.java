import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Integer[] coutcomes = new Integer[n];

        for (int i = 0; i < n; i++) coutcomes[i] = Integer.parseInt(st.nextToken());

        int winner = findWinnerIndex(coutcomes);

        System.out.println(winner == -1 ? "none" : winner + 1);
    }

    public static int findWinnerIndex(Integer[] outcomes) {
        HashMap<Integer, Integer> outcomeCounts = new HashMap<>();

        for (int outcome : outcomes) {
            outcomeCounts.put(outcome, outcomeCounts.getOrDefault(outcome, 0) + 1);
        }

        int winnerIndex = -1;

        int max = 0;
        for (int i = 0; i < outcomes.length; i++) {
            if (outcomeCounts.get(outcomes[i]) == 1 && max < outcomes[i]) {
                max = outcomes[i];
                winnerIndex = i;
            }
        }

        return winnerIndex;
    }
}
