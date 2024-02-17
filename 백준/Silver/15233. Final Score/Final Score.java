import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        Map<String, Integer> teamA = new HashMap<>();
        Map<String, Integer> teamB = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) teamA.put(st.nextToken(), 0);

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) teamB.put(st.nextToken(), 0);

        st = new StringTokenizer(br.readLine());

        int ab = 0;
        for(int i = 0; i < g; i++) {

            String name = st.nextToken();
            if(teamA.containsKey(name)) ab++;
            else ab--;
        }

        System.out.println(ab > 0 ? "A" : ab < 0 ? "B" : "TIE");
    }

}