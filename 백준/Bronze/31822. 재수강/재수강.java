import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int code = Integer.parseInt(br.readLine().substring(0, 5));
        int n = Integer.parseInt(br.readLine());

        int ans = 0;
        while (n --> 0) {

            int target = Integer.parseInt(br.readLine().substring(0, 5));
            if (code == target) ans++;
        }

        System.out.println(ans);
    }
}
