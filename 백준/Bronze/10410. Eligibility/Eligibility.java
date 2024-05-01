import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String[] startDate = st.nextToken().split("/");
            String[] birthDate = st.nextToken().split("/");
            int courses = Integer.parseInt(st.nextToken());

            if (Integer.parseInt(startDate[0]) >= 2010 || Integer.parseInt(birthDate[0]) >= 1991) sb.append(name).append(" eligible");
            else if(courses >= 41) sb.append(name).append(" ineligible");
            else sb.append(name).append(" coach petitions");

            sb.append("\n");
        }

        System.out.println(sb);
    }

}
