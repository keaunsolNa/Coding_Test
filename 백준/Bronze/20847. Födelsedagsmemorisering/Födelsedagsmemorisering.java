import java.io.*;
import java.util.*;

public class Main {

    private static class Friend {

        String name;
        int order;
        String date;

        public Friend (String name, int order, String date){
            this.name = name;
            this.order = order;
            this.date = date;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Map<String, Friend> map = new HashMap<>();
        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int order = Integer.parseInt(st.nextToken());
            String date = st.nextToken();

            if(!map.containsKey(date)) map.put(date, new Friend(name, order, date));
            else {

                if(map.get(date).order < order) map.put(date, new Friend(name, order, date));
            }
        }

        List<String> list = new ArrayList<>(map.keySet());
        list.sort(Comparator.comparing(v -> map.get(v).name));
        System.out.println(map.size());
        for(String key : list) System.out.println(map.get(key).name);
    }
}