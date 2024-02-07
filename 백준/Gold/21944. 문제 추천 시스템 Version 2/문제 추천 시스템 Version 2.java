import java.io.*;
import java.util.*;

public class Main {

    private static int g;
    private static int l;
    private static int p;
    private static class Question implements Comparable<Question> {

        int no;
        int level;
        int g;

        public Question(int no, int level, int g) {

            this.no = no;
            this.level = level;
            this.g = g;
        }

        @Override
        public int compareTo(Question question) {

            if(this.level == question.level) {
                return Integer.compare(no, question.no);
            }
            return Integer.compare(level, question.level);
        }

        @Override
        public boolean equals(Object object) {

            if(this == object) return true;

            if(object == null) return false;

            if(getClass() != object.getClass()) return false;

            Question other = (Question) object;

            if(g != other.g) return false;

            if(level != other.level) return false;

            return no == other.no;

        }
    }

    private static TreeSet<Question> tree;
    private static List<TreeSet<Question>> listTree;
    private static HashMap<Integer, int[]> hMap;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        tree = new TreeSet<>();
        listTree = new ArrayList<>();
        hMap = new HashMap<>();

        for(int i = 0; i <= 100; i++) listTree.add(new TreeSet<>());

        while(n --> 0) {

            st = new StringTokenizer(br.readLine());

            p = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            add();

        }

        int m = Integer.parseInt(br.readLine());

        while(m --> 0) {

            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();

            int x;
            switch (order) {

                case "add" -> {

                    p = Integer.parseInt(st.nextToken());
                    l = Integer.parseInt(st.nextToken());
                    g = Integer.parseInt(st.nextToken());
                    add();

                }

                case "recommend" -> {

                    g = Integer.parseInt(st.nextToken());
                    x = Integer.parseInt(st.nextToken());

                    if(x == 1) sb.append(listTree.get(g).last().no).append("\n");
                    else sb.append(listTree.get(g).first().no).append("\n");

                }

                case "recommend2" -> {

                    x = Integer.parseInt(st.nextToken());

                    if(x == 1) sb.append(tree.last().no).append("\n");
                    else sb.append(tree.first().no).append("\n");

                }

                case "recommend3" -> {

                    x = Integer.parseInt(st.nextToken());
                    l = Integer.parseInt(st.nextToken());
                    if (x == 1) {

                        if (tree.ceiling(new Question(0, l, 0)) == null) sb.append("-1\n");
                        else sb.append(Objects.requireNonNull(tree.ceiling(new Question(0, l, 0))).no).append("\n");

                    } else {

                        if (tree.lower(new Question(0, l, 0)) == null) sb.append("-1\n");
                        else sb.append(Objects.requireNonNull(tree.lower(new Question(0, l, 0))).no).append("\n");

                    }
                }

                case "solved" -> {
                    p = Integer.parseInt(st.nextToken());

                    if (!hMap.containsKey(p)) continue;;

                    l = hMap.get(p)[0];
                    g = hMap.get(p)[1];

                    hMap.remove(p);
                    tree.remove(new Question(p, l, g));
                    listTree.get(g).remove(new Question(p, l, g));
                }
            }
        }

        System.out.println(sb);

    }

    private static void add() {
        listTree.get(g).add(new Question(p, l, g));
        tree.add(new Question(p, l, g));
        hMap.put(p, new int[] {l, g});
    }
}