package baekjoon_StepByStep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Test24_PriorityQueue {

	public static void main(String[] args) throws IOException {
		test03();
	}
   
	// 11279번 - 최대 힙
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(pq.peek() == null) {
					sb.append(0).append("\n");
					pq.poll();
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(input);
			}
		}
		
		System.out.println(sb);
	}

	// 1927번 - 최소 힙
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input == 0) {
				if(pq.peek() == null) {
					sb.append(0).append("\n");
					pq.poll();
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(input);
			}
		}
		
		System.out.println(sb);
	}
	
	// 11286번 - 절대값 힙
	public static void test03() throws IOException {
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
