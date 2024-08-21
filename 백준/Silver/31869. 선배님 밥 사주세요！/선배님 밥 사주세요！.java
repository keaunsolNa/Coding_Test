import java.io.*;
import java.util.*;

public class Main {

    private static BufferedReader br;
    private static int N;
    private static HashMap<String, Integer> seniorList;
    private static ArrayList<Appointment>[][] arr;

    private static class Appointment {
        String name;
        int value;

        private Appointment(String name, int value) {
            this.name = name;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input();

        bw.write(solve());
        bw.close();
    }

    private static String solve() {
        StringBuilder sb = new StringBuilder();

        int ans = 0;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                boolean flag = false;
                List<Appointment> promises = arr[i][j];

                for (Appointment promise : promises) {
                    if (seniorList.get(promise.name) >= promise.value) {
                        seniorList.put(promise.name, seniorList.getOrDefault(promise.name, 0) - promise.value);
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    count++;
                } else {
                    ans = Math.max(ans, count);
                    count = 0;
                }
            }
        }
        sb.append(Math.max(ans, count));
        return sb.toString();
    } 

    private static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        seniorList = new HashMap<>();
        StringTokenizer st;
        arr = new ArrayList[11][7];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int w = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            arr[w][d].add(new Appointment(s, p));
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            seniorList.put(name, value);
        }

    } 
}