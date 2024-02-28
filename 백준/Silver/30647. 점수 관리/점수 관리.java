import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    private static class Participant {

        String name;
        int score;
        boolean isHidden;

        public Participant(String name, int score, boolean isHidden) {

            this.name = name;
            this.score = score;
            this.isHidden = isHidden;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Participant[] participants = new Participant[n];

        for (int i = 0; i < n; i++) {

            String input = br.readLine().replace("[", "");
            input = input.replace("]", "");
            input = input.replaceAll("\"", "");
            input = input.replace("{", "");
            input = input.replace("}", "");

            st = new StringTokenizer(input, ",");
            String name = st.nextToken().split(":")[1];
            int score = Integer.parseInt(st.nextToken().split(":")[1]);
            boolean isHidden = Integer.parseInt(st.nextToken().split(":")[1]) == 1;

            participants[i] = new Participant(name, score, isHidden);
        }
        Arrays.sort(participants, new Comparator<Participant>() {

            @Override
            public int compare(Participant participant, Participant t1) {

                if(t1.score == participant.score) return participant.name.compareTo(t1.name);
                return t1.score - participant.score;
            }
        });

        int number = 0;
        int cnt = 1;
        int prevScore = 0;
        for (int i = 0; i < participants.length; i++) {

            Participant participant = participants[i];

            if(participant.score == prevScore) cnt++;
            else {
                number += cnt;
                cnt = 1;
            }
            prevScore = participant.score;
            if (!participant.isHidden) sb.append(number).append(" ").append(participant.name).append(" ").append(participant.score).append("\n");

        }

        System.out.println(sb);
    }
}