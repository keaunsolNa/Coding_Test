import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            int[] visit = new int[101];
            int maxIndex = 0;
            int max = 0;
            int second = 0;
            int secondIndex = 0;
            int[][] arr = new int[101][101];
            int[] check = new int[101];

            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            double aver = (double) v / 2;

            for (int i = 0; i < v; i++) {

                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < c; j++)
                    arr[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < v; i++) {
                if (arr[i][0] != 0)
                    check[arr[i][0]]++;
            }

            for (int i = 0; i <= c; i++) {
                if (check[i] > max) {
                    max = check[i];
                    maxIndex = i;
                }
            }

            for (int i = 0; i <= c; i++) {
                if (check[i] > second && second <= max && maxIndex != i) {
                    second = check[i];
                    secondIndex = i;
                }
            }

            if (max >= aver)
                System.out.println(maxIndex + " 1");
            else {
                for (int i = 1; i < c; i++) {
                    for (int j = 0; j < v; j++) {
                        if (arr[j][0] != maxIndex && arr[j][0] != secondIndex && visit[j] == 0) {
                            if (arr[j][i] == maxIndex) {
                                max++;
                                visit[j]++;
                            } else if (arr[j][i] == secondIndex) {
                                second++;
                                visit[j]++;
                            }
                        }
                    }
                }

                if (max >= aver)
                    System.out.println(maxIndex + " 2");
                else if (second >= aver)
                    System.out.println(secondIndex + " 2");
            }
        }
    }
}