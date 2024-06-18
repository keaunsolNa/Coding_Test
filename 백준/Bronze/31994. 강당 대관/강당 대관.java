import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = 0;
        String winner = "";
        for (int i = 0; i < 7; i++) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int person = Integer.parseInt(st.nextToken());

            if (max < person) {

                max = person;
                winner = name;
            }
        }

        System.out.println(winner);
    }

}