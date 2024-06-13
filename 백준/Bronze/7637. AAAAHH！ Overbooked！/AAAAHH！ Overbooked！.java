import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int t = Integer.parseInt(br.readLine());
            if (t == 0) break;

            boolean[] timeArr = new boolean[1440];
            boolean isConflict = false;
            while (t --> 0) {

                String[] time = br.readLine().split("-");
                String startH = time[0].split(":")[0];
                String startM = time[0].split(":")[1];
                int startTime = Integer.parseInt(startH) * 60 + Integer.parseInt(startM);

                String endH = time[1].split(":")[0];
                String endM = time[1].split(":")[1];
                int endTime = Integer.parseInt(endH) * 60 + Integer.parseInt(endM);

                for (int i = startTime; i <= endTime; i++) {

                    if (timeArr[i] && (i != startTime && i != endTime)) {

                        isConflict = true;
                        break;
                    }

                    else timeArr[i] = true;
                }

            }
            sb.append(isConflict ? "conflict" : "no conflict").append("\n");
        }

        System.out.println(sb);

    }


}