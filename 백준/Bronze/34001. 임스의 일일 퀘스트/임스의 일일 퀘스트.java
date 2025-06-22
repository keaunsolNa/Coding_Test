import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        int[][] level = new int[13][3];
        level[0][0] = 200;
        level[0][1] = 210;
        level[0][2] = 220;

        level[1][0] = 210;
        level[1][1] = 220;
        level[1][2] = 225;

        level[2][0] = 220;
        level[2][1] = 225;
        level[2][2] = 230;

        level[3][0] = 225;
        level[3][1] = 230;
        level[3][2] = 235;

        level[4][0] = 230;
        level[4][1] = 235;
        level[4][2] = 245;

        level[5][0] = 235;
        level[5][1] = 245;
        level[5][2] = 250;

        level[6][0] = 260;
        level[6][1] = 265;
        level[6][2] = 270;

        level[7][0] = 265;
        level[7][1] = 270;
        level[7][2] = 275;

        level[8][0] = 270;
        level[8][1] = 275;
        level[8][2] = 280;

        level[9][0] = 275;
        level[9][1] = 280;
        level[9][2] = 285;

        level[10][0] = 280;
        level[10][1] = 285;
        level[10][2] = 290;

        level[11][0] = 285;
        level[11][1] = 290;
        level[11][2] = 295;

        level[12][0] = 290;
        level[12][1] = 295;
        level[12][2] = 300;

        for (int i = 0; i <= 12; i++) {

            int decrease = 0;
            for (int j = 0; j < 3; j++) {
                if (l >= level[i][j])
                {
                    decrease = j == 0 ? 0 : j == 1 ? 200 : 400;
                }
            }

            if (l < level[i][0]) bw.write("0 ");
            else bw.write(500 - decrease + " ");

            if (i == 5) bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}