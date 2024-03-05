import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t --> 0) {

            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> fileMap = new TreeMap<>();

            for (int i = 0; i < n; i++) {

                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int id = Integer.parseInt(st.nextToken());

                if(fileMap.containsKey(name)) fileMap.put(name, Math.min(id, fileMap.get(name)));
                else fileMap.put(name, id);

            }

            List<Map.Entry<String, Integer>> entryList = new LinkedList<>(fileMap.entrySet());
            entryList.sort(Comparator.comparingInt(Map.Entry::getValue));

            for (Map.Entry<String, Integer> stringIntegerEntry : entryList) {
                sb.append(stringIntegerEntry.getValue()).append(" ");
            }
            sb.append("\n");

        }

        System.out.print(sb);

    }
}
