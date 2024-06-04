import java.util.*;
import java.io.*;

public class Main {

    private static class Team {

        private final String name;
        private final int point;

        public Team (String name, int point) {

            this.name = name;
            this.point = point;

        }

    }

    private static String want;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        want = br.readLine();
        String last = br.readLine();

        Team[] winTeam  = new Team[n];
        Team[] drawTeam = new Team[n];
        Team[] loseTeam = new Team[n];

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int point = Integer.parseInt(st.nextToken());

            if (name.equals(want)) {

                winTeam[i] = new Team(name, point + 3);
                drawTeam[i] = new Team(name, point + 1);
                loseTeam[i] = new Team(name, point);

            }

            else if (name.equals(last)) {

                winTeam[i] = new Team(name, point);
                drawTeam[i] = new Team(name, point + 1);
                loseTeam[i] = new Team(name, point + 3);

            }

            else {

                winTeam[i] = new Team(name, point);
                drawTeam[i] = new Team(name, point);
                loseTeam[i] = new Team(name, point);
            }

        }

        sort(winTeam);
        sort(drawTeam);
        sort(loseTeam);

        System.out.println(find(winTeam) + " " + find(drawTeam) + " " + find(loseTeam));

    }

    private static void sort (Team[] teams) {

        Arrays.sort(teams, (o1, o2) -> {

            if (o1.point == o2.point) {
                return o1.name.compareTo(o2.name);
            }

            else return Integer.compare(o2.point, o1.point);
        });
    }

    private static int find (Team[] teams) {

        for (int i = 0; i < teams.length; i++) {

            if (teams[i].name.equals(want)) return i + 1;
        }

        return 0;
    }
}
