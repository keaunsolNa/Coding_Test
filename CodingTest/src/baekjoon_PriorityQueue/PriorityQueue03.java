package baekjoon_PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PriorityQueue03 {

	public static void main(String[] args) throws IOException {
		test02();
	}
	
	private static class Pair implements Comparable<Pair> {
        
		int start;
        int end;
        
        Pair(int a, int b) {
            start = a; end = b;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.end, o.end);
        }
        
    }
	
	private static class Room {
	    int p;
	    int q;
	    int room;
	    
	    public Room(int p, int q) {
	        this.p = p;
	        this.q = q;
	    }
	    
	}

	
	// 13334번 - 철로
	private static ArrayList<Pair> pairs = new ArrayList<>();
	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N ; i++){

			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			if(a > b){
            
				int temp = a;
				a = b;
				b = temp;
				
			}

			pairs.add(new Pair(a,b));
         
		}
	

        int length = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        Collections.sort(pairs);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int count = 0;
        int maximum = 0;
        
        for (Pair pair : pairs) {
        	
            while (!pq.isEmpty() && pq.peek() < pair.end - length) {
            	
                pq.poll();
                count--;
                
            }

            if (pair.start >= pair.end - length) {
            	
                count++;
                pq.add(pair.start);
                
            }

            maximum = Math.max(maximum, count);
        }
        
        System.out.println(maximum);
	}
	
	
	// 
	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
        List<Room> arr = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
        	
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            arr.add(new Room(p, q));
            
        }

        Collections.sort(arr, (o1, o2) -> o1.p - o2.p);

        PriorityQueue<Room> rooms = new PriorityQueue<>((o1, o2) -> o1.q - o2.q);
        PriorityQueue<Room> candidates = new PriorityQueue<>((o1, o2) -> o1.room - o2.room);
        int[] roomCnt = new int[n];

        int roomNo = 0;
        for (Room cur : arr) {
        	
            while (!rooms.isEmpty() && rooms.peek().q < cur.p) candidates.add(rooms.poll());
            
            int selectedRoomNo = candidates.isEmpty() ? roomNo++ : candidates.poll().room;
            roomCnt[selectedRoomNo]++;
            cur.room = selectedRoomNo;
            rooms.add(cur);
            
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < n && roomCnt[i] != 0; i++, cnt++) sb.append(roomCnt[i]).append(' ');
        
        System.out.println(cnt);
        System.out.println(sb);
	}
	
	
	// 
	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	}
	
	
	
}
