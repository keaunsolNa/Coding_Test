import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
        	
            @Override
            public int compare(Integer o1, Integer o2){
                int A = Math.abs(o1);
                int B = Math.abs(o2);
                if(A > B)
                    return A - B;

                else if(A == B){
                    if(o1 > o2) return 1;
                    else return -1;
                }

                else
                    return -1;
            }
        });
		
        int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int number = Integer.parseInt(br.readLine());
			
			if(number != 0) {
				pq.add(number);
			} else {
				if(pq.peek() != null) {
					System.out.println(pq.poll());
				} else {
					System.out.println("0");
				}
			}
		}
		
	}
}
