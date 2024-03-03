import java.io.*;
import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int now = n, answer = enemy.length;
        int card = k;

        for (int i = 0; i < enemy.length; i++) {

            now -= enemy[i];
            pq.add(enemy[i]);

            if(now < 0) {

                if(card > 0 && !pq.isEmpty()) {

                    now += pq.poll();
                    card--;
                }

                else {
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}