import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            int totalLength = 1;
            while (n --> 0) {
                String name = br.readLine();
                totalLength *= name.length();
            }
            switch (totalLength) {
                case 232 : bw.write("2017\n");
                break;
                case 88 : bw.write("2018\n");
                break;
                case 754 : bw.write("2019\n");
                break;
                case 29 : bw.write("2020\n");
                break;
                case 28 : bw.write("2021\n");
                break;
                case 1015 : bw.write("2022\n");
                break;
                case 1295 : bw.write("2023\n");
                break;
                case 1073 : bw.write("2024\n");
                break;
                case 348 : bw.write("2025\n");
                break;
                default: bw.write("Goodbye, ChAOS!\n");
            }
        }

        bw.flush();
        bw.close();
    }
}