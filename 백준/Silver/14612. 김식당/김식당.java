import java.io.*;
import java.util.*;

public class Main {

    private static class PostIt {

        int table;
        int time;

        public PostIt (int table, int time) {

            this.table = table;
            this.time = time;
        }

    }

    private static List<PostIt> list;
    private static final StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        while(n --> 0) {

            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            if(order.equals("order")) {

                int table = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());

                list.add(new PostIt(table, time));
                print();
            }

            if(order.equals("complete")) {

                int table = Integer.parseInt(st.nextToken());

                for(PostIt postIt : list) {

                    if(postIt.table == table) { list.remove(postIt); break; }
                }
                print();
            }

            if(order.equals("sort")) {

                list.sort((t1, t2) -> t1.time == t2.time ? t1.table - t2.table : t1.time - t2.time);
                print();
            }
        }

        System.out.println(stringBuilder);
    }

    private static void print() {

        StringBuilder sb = new StringBuilder();

        for(PostIt postIt : list)
            sb.append(postIt.table).append(" ");

        if(list.isEmpty()) sb.append("sleep");

        stringBuilder.append(sb).append("\n");
    }
}