import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[][] magic = new int[4][4];
        for (int i = 0; i < 4; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) magic[i][j] = Integer.parseInt(st.nextToken());

        }

        int hab = magic[0][0] + magic[0][1] + magic[0][2] + magic[0][3];
        boolean check = true;
        for (int i = 0; i < 4; i++) {

            int sum = 0;
            for (int j = 0; j < 4; j++) sum += magic[i][j];

            if (sum != hab) {
                check = false;
                break;
            }
        }

        if (!check) {
            System.out.println("not magic");
            return;
        }

        for (int i = 0; i < 4; i++) {

            int sum = 0;

            for (int j = 0; j < 4; j++) sum += magic[j][i];

            if (sum != hab) {
                check = false;
                break;
            }
        }

        System.out.println(check ? "magic" : "not magic");
    }

}
