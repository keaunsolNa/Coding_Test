import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            if (k == 0) break;
            int m = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) list.add(Integer.parseInt(st.nextToken()));

            int pass = 0;
            for (int i = 0; i < m; i++) {

                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                int correct = 0;
                for (int j = 0; j < c; j++) {

                    int number = Integer.parseInt(st.nextToken());
                    if (list.contains(number)) correct++;

                }

                pass += correct >= r ? 1 : 0;
            }

            System.out.println(pass >= m ? "yes" : "no");

        }


    }



}
