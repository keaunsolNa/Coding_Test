import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        boolean[] position = new boolean[13];
        for(int i = 0; i < 7; i++) {

            st = new StringTokenizer(br.readLine());

            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());

            position[getConstellation(month, day)] = true;
        }

        List<int[]> passList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        while(n --> 0) {

            st = new StringTokenizer(br.readLine());

            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());

            if(!position[getConstellation(month, day)]) passList.add(new int[] {month, day});
        }

        passList.sort((o1, o2) -> {

            if (o1[0] == o2[0]) return o1[1] - o2[1];

            return o1[0] - o2[0];
        });

        for (int[] pass: passList
             ) {
            sb.append(pass[0]).append(" ").append(pass[1]).append("\n");
        }

        System.out.print(passList.isEmpty() ? "ALL FAILED" : sb);
    }

    private static int getConstellation(int month, int day) {

        switch (month) {
            case 1 -> {
                if (day > 19) return 1;
                else return 12;
            }
            case 2 -> {
                if (day > 18) return 2;
                else return 1;
            }
            case 3 -> {
                if (day > 20) return 3;
                else return 2;
            }
            case 4 -> {
                if (day > 19) return 4;
                else return 3;
            }
            case 5 -> {
                if (day > 20) return 5;
                else return 4;
            }
            case 6 -> {
                if (day > 21) return 6;
                else return 5;
            }
            case 7 -> {
                if(day > 22) return 7;
                else return 6;
            }
            case 8 -> {
                if(day > 22) return 8;
                else return 7;
            }
            case 9 -> {
                if(day > 22) return 9;
                else return 8;
            }
            case 10 -> {
                if(day > 22) return 10;
                else return 9;
            }
            case 11 -> {
                if(day > 22) return 11;
                else return 10;
            }
            case 12 -> {
                if(day > 21) return 12;
                else return 11;
            }

            default -> {
                return 0;
            }

        }
    }
}