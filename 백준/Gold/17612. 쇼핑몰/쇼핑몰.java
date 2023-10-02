import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

class Customer {
	
	int id;
	int w;
	
	Customer(int id, int w) {
		this.id = id;
		this.w = w;
	}
}

class Counter implements Comparable<Counter> {
	
	int index;
	int id;
	int time;
	
	Counter(int index, int time) {
		this.index = index;
		this.time = time;
	}
	
	Counter(int index, int id, int time) {
		this.index = index;
		this.id = id;
		this.time = time;
	}

	@Override
	public int compareTo(Counter o) {
		if(this.time < o.time) return -1;
		
		if(this.time == o.time) {
			
			if(this.index < o.index) return 1;
			else return -1;
			
		}
		
		return 1;
	}
}

public class Main {
    
    static int N, K, nowTime;
	static List<Integer> outCustomerTimeList = new ArrayList<Integer>();	
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		Queue<Customer> customerQueue = new LinkedList<Customer>();
		PriorityQueue<Counter> counterQueue = new PriorityQueue<Counter>();	
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			int id = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			customerQueue.offer(new Customer(id, w));	
		}
		
		for(int i = 0; i < K; i++) {
			if(customerQueue.isEmpty()) break;
			
			Customer customer = customerQueue.poll();
			counterQueue.offer(new Counter(i, customer.id, customer.w));
		}
		
		PriorityQueue<Integer> waitedCountmerQueue = new PriorityQueue<Integer>();	
		
		while(!counterQueue.isEmpty()) {
			
			if(!customerQueue.isEmpty()) {
				Counter counter = counterQueue.poll();
				
				nowTime = Math.max(nowTime, counter.time);
				waitedCountmerQueue.offer(counter.index);
				outCustomerTimeList.add(counter.id);
				
				while(!counterQueue.isEmpty()) {	
					
					if(counterQueue.peek().time == nowTime) {
						Counter tempCounter = counterQueue.poll();
						waitedCountmerQueue.offer(tempCounter.index);
						outCustomerTimeList.add(tempCounter.id);
						continue;
					}
					
					break;
				}
				
				while(!waitedCountmerQueue.isEmpty()) {
					if(customerQueue.isEmpty()) break;
					
					Customer newCustomer = customerQueue.poll();
					int nextIndex = waitedCountmerQueue.poll();
					Counter newCounter = new Counter(nextIndex, newCustomer.id, nowTime + newCustomer.w);
					counterQueue.offer(newCounter);
				}

				continue;
			}
			
			if(counterQueue.isEmpty()) break;
			
			Counter counter = counterQueue.poll();
			outCustomerTimeList.add(counter.id);
			
		}
		
		long result = 0;
		for(int i = 1; i <= outCustomerTimeList.size(); i++) {
			result += 1L * i * outCustomerTimeList.get(i - 1);
		}
		
		System.out.println(result);
	}
}
