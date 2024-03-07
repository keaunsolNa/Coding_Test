import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(br.readLine());

        int[] dow = new int[n];
        for (int i = 0; i < n; i++) dow[i] = Integer.parseInt(br.readLine());
        Arrays.sort(dow);

        int prevCost = a;
        int prevCal = c;
        double maxCal = (double)c / a;

        for (int i = n - 1; i >= 0; i--) {

            int tempCost = prevCost + b;
            int tempCal = prevCal + dow[i];

            if(maxCal < (double)tempCal / tempCost) {

                prevCal = tempCal;
                prevCost = tempCost;
                maxCal = (double)tempCal / tempCost;
            }

            else break;
        }

        System.out.println((int)maxCal);


    }



}
