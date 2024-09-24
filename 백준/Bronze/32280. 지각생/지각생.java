import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int teacherArrive = 0, arriveTime = 0;
        n++;
        int idx = 0;

        while (n --> 0)
        {
            st = new StringTokenizer(br.readLine());
            String[] time = st.nextToken().split(":");
            int mm = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            boolean teacher = st.nextToken().equals("teacher");

            if (!teacher) arr[idx++] = mm;
            else teacherArrive = mm;

        }

        String[] gosTime = br.readLine().split(":");
        arriveTime = Integer.parseInt(gosTime[0]) * 60 + Integer.parseInt(gosTime[1]);

        int ans = 0;

        for (int i : arr)
        {

            if (i >= arriveTime)
            {
                if (i >= teacherArrive) ans++;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();

    }

}