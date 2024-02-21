import java.io.*;
import java.util.*;

class Solution {

    public int solution(int[][] data, int col, int row_begin, int row_end) {

        Arrays.sort(data, (o1, o2) -> {

            if(o1[col - 1] == o2[col - 1]) return o2[0] - o1[0];
            else return o1[col - 1] - o2[col - 1];

        });

        int[] arr = new int[row_end - row_begin + 1];
        int ans = 0;
        for(int i = row_begin - 1; i < row_end; i++) {

            int s = 0;
            for(int temp : data[i])
                s += temp % (i + 1);

            ans = ans ^ s;
        }


        return ans;
    }
}