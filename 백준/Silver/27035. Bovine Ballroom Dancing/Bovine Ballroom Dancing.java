import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] male = new int[n];
        for (int i = 0; i < n; i++) male[i] = Integer.parseInt(br.readLine());

        int[] female = new int[n];
        for (int i = 0; i < n; i++) female[i] = Integer.parseInt(br.readLine());

        Arrays.sort(male);
        Arrays.sort(female);

        int sum = 0;
        for (int i = 0; i < n; i++) sum += Math.abs(male[i] - female[i]);

        System.out.println(sum);
    }
}
