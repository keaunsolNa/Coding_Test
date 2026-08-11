import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

   private static int n;

	public static void main(String[] args) throws IOException {
		test04();
	}

   public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			PriorityQueue<Reward> reward = new PriorityQueue<>();
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				
				int k = Integer.parseInt(st.nextToken());
				int[] arr = new int[k];
				
				for(int i = 0; i < k; i++) arr[i] = Integer.parseInt(st.nextToken());
				
				int money = Integer.parseInt(st.nextToken());

				reward.add(new Reward(money, arr));
			}
			
			int[] sticker = new int[m];
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < m; i++) sticker[i] = Integer.parseInt(st.nextToken());
			long totalMoney = 0;
			
			while(!reward.isEmpty()) {
				
				Reward temp = reward.poll();
				boolean flag = true;
				while(true) {
					
					for(int i = 0; i < temp.need.length; i++) {
						if(sticker[temp.need[i] - 1] < 1) {
							flag = false;
						}
					}
					if(!flag) break;
					
					for(int i = 0; i < temp.need.length; i++) {
						sticker[temp.need[i] - 1]--;
					}
					
					totalMoney += temp.money;
					
				}
			}
			System.out.println(totalMoney);
		}
		
	}

   private static class Reward implements Comparable<Reward>{
	   
	   int money;
	   int[] need;
	   
	   private Reward(int money, int[] need) {
		   this.money = money;
		   this.need = need;
	   }
	   
	   @Override
       public int compareTo(Reward o) {
       	
           return o.money - this.money;
       }
   }
}
