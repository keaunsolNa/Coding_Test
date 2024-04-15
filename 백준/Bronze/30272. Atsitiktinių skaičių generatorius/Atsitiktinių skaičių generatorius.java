import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = new String[10];

        number[0] = "..#####..\n" +
                ".##...##.\n" +
                "##.....##\n" +
                "##.....##\n" +
                "##.....##\n" +
                ".##...##.\n" +
                "..#####..";

        number[1] = "....##...\n" +
                "..####...\n" +
                "....##...\n" +
                "....##...\n" +
                "....##...\n" +
                "....##...\n" +
                "..######.";

        number[2] = ".#######.\n" +
                "##.....##\n" +
                ".......##\n" +
                ".#######.\n" +
                "##.......\n" +
                "##.......\n" +
                "#########";

        number[3] = ".#######.\n" +
                "##.....##\n" +
                ".......##\n" +
                ".#######.\n" +
                ".......##\n" +
                "##.....##\n" +
                ".#######.";

        number[4] = "##.......\n" +
                "##....##.\n" +
                "##....##.\n" +
                "##....##.\n" +
                "#########\n" +
                "......##.\n" +
                "......##.";

        number[5] = ".########\n" +
                ".##......\n" +
                ".##......\n" +
                ".#######.\n" +
                ".......##\n" +
                ".##....##\n" +
                "..######.";

        number[6] = ".#######.\n" +
                "##.....##\n" +
                "##.......\n" +
                "########.\n" +
                "##.....##\n" +
                "##.....##\n" +
                ".#######.";

        number[7] = ".########\n" +
                ".##....##\n" +
                ".....##..\n" +
                "....##...\n" +
                "...##....\n" +
                "...##....\n" +
                "...##....";

        number[8] = ".#######.\n" +
                "##.....##\n" +
                "##.....##\n" +
                ".#######.\n" +
                "##.....##\n" +
                "##.....##\n" +
                ".#######.";

        number[9] = ".#######.\n" +
                "##.....##\n" +
                "##.....##\n" +
                ".########\n" +
                ".......##\n" +
                "##.....##\n" +
                ".#######.";

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {

            StringBuilder sb = new StringBuilder();

            while (true) {

               String input = br.readLine();

               if(input.equals(".........")) { n--; break;}

               sb.append(input).append("\n");
            }

            sb.deleteCharAt(sb.length() - 1);
            for (int i = 0; i < 10; i++) {

                if (sb.toString().equals(number[i])) System.out.print(i);
            }
        }




    }

}