import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            sb.append("G".repeat(n));

            sb.append(".".repeat(n));

            sb.append(".".repeat(n));

            sb.append(".".repeat(n));

            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {

            sb.append(".".repeat(n));

            sb.append("I".repeat(n));

            sb.append(".".repeat(n));

            sb.append("T".repeat(n));

            sb.append("\n");
        }

        for (int i = 0; i < n; i++) {

            sb.append(".".repeat(n));

            sb.append(".".repeat(n));

            sb.append("S".repeat(n));

            sb.append(".".repeat(n));

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
