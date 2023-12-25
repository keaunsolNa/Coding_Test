import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {

            int team = Integer.parseInt(br.readLine());

            if(team == 0) break;

            st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE;
            int winner = 0;
            for(int i = 0; i < team; i++) {

                int temp = Math.abs(2023 - Integer.parseInt(st.nextToken()));

                if(min > temp) {
                    min = temp;
                    winner = i;
                }
            }

            System.out.println(winner + 1);

        }
    }

}

