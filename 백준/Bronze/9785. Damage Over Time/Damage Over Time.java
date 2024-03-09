import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] skill = new int[n][2];
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            skill[i][0] = Integer.parseInt(st.nextToken());
            skill[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(skill, ((o1, o2) -> o2[0] - o1[0]));

        int total = 0;
        int min = Integer.MAX_VALUE;

        for (int[] temp : skill) {
            total += temp[0];
            min = Math.min(temp[1], min);
            m--;
            if(m == 0) break;
        }

        System.out.println(total + " " + min);
    }


}
