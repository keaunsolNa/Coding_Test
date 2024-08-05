import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        map.put("Joffrey", n * a);
        map.put("Robb", m * b);
        map.put("Stannis", k * c);

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> {
            if (Objects.equals(o2.getValue(), o1.getValue())) return o1.getKey().compareTo(o2.getKey());
            return o2.getValue() - o1.getValue();
        });

        sb.append(entryList.get(0).getKey());
        for (int i = 1; i < entryList.size(); i++)
        {

            if (Objects.equals(entryList.get(i).getValue(), entryList.get(0).getValue()))
            {
                sb.append(" ").append(entryList.get(i).getKey());
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }



}

