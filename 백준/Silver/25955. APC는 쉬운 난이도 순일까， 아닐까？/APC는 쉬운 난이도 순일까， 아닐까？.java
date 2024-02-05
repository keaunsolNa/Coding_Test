import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] tierList = new String[n];
        for(int i = 0; i < n; i++) tierList[i] = st.nextToken();

        String[] sortList = tierList.clone();

        Arrays.sort(sortList, (o1, o2) -> {

            String key = o1.substring(0, 1);
            String key2 = o2.substring(0, 1);
            int value = Integer.parseInt(o1.substring(1));
            int value2 = Integer.parseInt(o2.substring(1));

            if (key.compareTo(key2) == 0) return value2 - value;

            else {

                key = convertRank(key);
                key2 = convertRank(key2);

                return key.compareTo(key2);
            }
        });

        for(int i = 0; i < n; i++) {

            if(!sortList[i].equals(tierList[i])) sb.append(sortList[i]).append(" ");
        }

        System.out.println(sb.isEmpty() ? "OK" : "KO\n" + sb.toString());

    }

    private static String convertRank(String rank) {

        switch (rank) {
            case "B" -> {
                return "0";
            }
            case "S" -> {
                return "1";
            }
            case "G" -> {
                return "2";
            }
            case "P" -> {
                return "3";
            }
            default -> {
                return "4";
            }
        }
    }
}
