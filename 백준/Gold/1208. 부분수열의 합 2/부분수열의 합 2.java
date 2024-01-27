import java.io.*;
import java.util.*;

public class Main {

    private static int s;
    private static long[] arr;
    private static final List<Long> left = new ArrayList<>();
    private static final List<Long> right = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new long[n];

        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        getSubSeq(0, n / 2, 0, left);
        getSubSeq(n / 2, n, 0, right);

        Collections.sort(left);
        Collections.sort(right);

        long cnt = getCnt();

        if (s == 0) cnt--;

        System.out.println(cnt);

    }

    private static void getSubSeq(int start, int end, long sum, List<Long> list) {

        if(start == end) {
            list.add(sum);
            return;
        }

        getSubSeq(start + 1, end, sum + arr[start], list);
        getSubSeq(start + 1, end, sum, list);
    }

    private static long getCnt() {

        int l = 0;
        int r = right.size() - 1;
        long cnt = 0;

        while(l < left.size() && r >= 0) {

            long sum = left.get(l) + right.get(r);

            if(sum == s) {

                long a = left.get(l);
                long cnt1 = 0;
                while(l < left.size() && left.get(l) == a) {
                    l++;
                    cnt1++;
                }

                long b = right.get(r);
                long cnt2 = 0;
                while(r >= 0 && right.get(r) == b) {
                    r--;
                    cnt2++;
                }

                cnt += cnt1 * cnt2;
            }

            else if(sum < s) l++;
            else r--;
        }

        return cnt;
    }

}