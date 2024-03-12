import java.io.*;
import java.util.*;

public class Main {

    private static class Time implements Comparable<Time>{

        int hour;
        int min;
        int sec;

        public Time(int hour, int min, int sec) {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }

        @Override
        public int compareTo(Time o) {

            if (o.hour == this.hour && o.min == this.min) return this.sec - o.sec;

            else if (o.hour == this.hour) return this.min - o.min;

            return  this.hour - o.hour;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Time> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int hh = Integer.parseInt(st.nextToken());
            int mm = Integer.parseInt(st.nextToken());
            int ss = Integer.parseInt(st.nextToken());

            pq.add(new Time(hh, mm, ss));
        }

        while (!pq.isEmpty()) {

            Time time = pq.poll();
            System.out.println(time.hour + " " + time.min + " " + time.sec);
        }
    }



}
