import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<String, Boolean> map = new HashMap<>();

        while (n --> 0)
        {
            String key = br.readLine();
            map.put(key, false);
        }

        int m = Integer.parseInt(br.readLine());
        boolean isOpen = false;

        while (m --> 0)
        {
            String target = br.readLine();

            if (map.containsKey(target))
            {
                bw.write(isOpen ? "Closed by " + target + "\n" : "Opened by " + target + "\n");
                isOpen = !isOpen;
            }

            else
            {
                bw.write("Unknown " + target + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}