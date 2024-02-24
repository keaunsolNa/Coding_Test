import java.io.*;
import java.util.*;

public class Main {

    private static class RoomTime {

        int startTime;
        int endTime;

        public RoomTime(String startTime, String endTime) {

            this.startTime = stringToInt(startTime);
            this.endTime = ((stringToInt(endTime) + 10) % 100 >= 60 ? stringToInt(endTime) + 50 : stringToInt(endTime) + 10);

        }

        private int stringToInt(String time) {

            int hh = Integer.parseInt(time.split(":")[0]) * 60;
            int mm = Integer.parseInt(time.split(":")[1]);
            return hh + mm;
        }
    }


    public static void main(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;

        String[][] book_time = new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}};

        RoomTime[] roomTimes = new RoomTime[book_time.length];
        for(int i = 0; i < book_time.length; i++) {
            roomTimes[i] = new RoomTime(book_time[i][0], book_time[i][1]);
        }

        Arrays.sort(roomTimes, ((Comparator.comparingInt(o -> o.startTime))));

        PriorityQueue<RoomTime> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.endTime));

        for(RoomTime RoomTime : roomTimes) {

            if(pq.isEmpty()) pq.add(RoomTime);

            else {

                RoomTime temp = pq.peek();
                int start = temp.startTime;
                int end = temp.endTime;

                if(RoomTime.startTime >= end) pq.poll();

                pq.add(RoomTime);
            }
        }

        System.out.println(pq.size());
    }

}