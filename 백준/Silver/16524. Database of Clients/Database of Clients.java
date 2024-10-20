import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Set<String>> emailMap = new HashMap<>();

        while (n --> 0)
        {

            st = new StringTokenizer(br.readLine(), "@");
            String name = st.nextToken().replaceAll("\\.", "");
            if (name.contains("+")) name = name.substring(0, name.indexOf("+"));
            String domain = st.nextToken();

            if (emailMap.containsKey(name))
            {
                emailMap.get(name).add(domain);
            }
            else
            {
                Set<String> list = new HashSet<>();
                list.add(domain);
                emailMap.put(name, list);
            }
        }

        int ans = 0;
        for (String key : emailMap.keySet())
        {
            ans += emailMap.get(key).size();
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }


}
