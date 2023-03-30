package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BruteForcePlus06 {
	
   public static void main(String[] args) throws IOException {
      test06();
   }
	
   private static class BD {
       int data;
       int strike;
       int ball;

       public BD(int data, int strike, int ball) {
           this.data = data;
           this.strike = strike;
           this.ball = ball;
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
   
   private static List<BD> data = new ArrayList<>();
   private static int n;
   
   // 2503번 - 숫자 야구
   public static void test01() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int number = Integer.parseInt(st.nextToken());
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            BD baseBallData = new BD(number, strike, ball);
            data.add(baseBallData);
        }

        System.out.println(calBaseBall());
    }

   private static int calBaseBall() {
        int result = 0;

        for (int i = 123; i <= 987; i++) {
            if (!checkSameNum(i)) continue; 

            int allTestPass = 0;

            for (int j = 0; j < n; j++) {
                int strikeCount = 0;
                int ballCount = 0;

                BD current = data.get(j);
                String currentDataString = Integer.toString(current.data);
                String myDataString = Integer.toString(i);

                for (int k = 0; k < 3; k++) { // strike
                    if (currentDataString.charAt(k) == myDataString.charAt(k)) {
                        strikeCount++;
                    }
                }

                for (int h = 0; h < 3; h++) {
                    for (int u = 0; u < 3; u++) {
                        if (myDataString.charAt(h) == currentDataString.charAt(u)) { // ball
                            if (h != u)
                                ballCount++;
                        }
                    }
                }

                if (current.strike == strikeCount && current.ball == ballCount) {
                    allTestPass++;
                }
            }
            if (allTestPass == n) {
                result++;
            }
        }
        return result;
    }

   private static boolean checkSameNum(int num) {

        String numString = Integer.toString(num);

        if (numString.charAt(0) == numString.charAt(1))  return false;

        if (numString.charAt(1) == numString.charAt(2))  return false;

        if (numString.charAt(0) == numString.charAt(2)) return false;
        
        if (numString.charAt(0) == '0' || numString.charAt(1) == '0' || numString.charAt(2) == '0') return false;

        return true;
    }

   // 4375번 - 1
   public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String input = "";
		
		while((input = br.readLine()) != null) {
			
			int num = Integer.parseInt(input);
			int k = 0;
		
			for(int i = 1; ; i++) {
				
				k = k * 10 + 1;
				k = k % num;
				
				if(k == 0) {
					sb.append(i + "\n");
					break;
				}
			}
		}
		
		System.out.println(sb);
	}
	
   // 2548번 - 대표 자연수
   public static void test03() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        int[] sum = new int[100001];
        int[] cnt = new int[100001];
        
        for (int i = 1; i <= n; i++) {
        	
            int cur = Integer.parseInt(st.nextToken());
            sum[cur] += cur;
            cnt[cur]++;
            
        }
        
        for (int i = 1; i <= 10000; i++) {
        	
            sum[i] += sum[i - 1];
            cnt[i] += cnt[i - 1];
            
        }
        
        int min = Integer.MAX_VALUE;
        int answer = 0;
        
        for (int i = 1; i <= 10000; i++) {
        	
            if (cnt[i] - cnt[i - 1] == 0) continue;
            int calc = (i * cnt[i - 1] - sum[i - 1]) + (sum[10000] - sum[i] - i * (cnt[10000] - cnt[i]));
            if (min > calc) {
                min = calc;
                answer = i;
            }
        }
        
        System.out.println(answer);
		
	}
	
   // 9329번 - 패스트 푸드 상금
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

   // 17451번 - 평행 우주
   public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		long speed = arr[n - 1];
		for(int i = n - 2; i >= 0; i--) {
			
			if(arr[i] > speed) speed = arr[i];
			
			else if(speed % arr[i] != 0) 
				speed = (speed / arr[i] + 1) * arr[i];
		}
		
		System.out.println(speed);
	}
	
   // 11501번 - 주식 
   public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			long[] money = new long[N + 1];
			for(int i = 0; i < N; i++) money[i] = Integer.parseInt(st.nextToken());
			
			long max = 0;
			long gain = 0;
			for(int i = N - 1; i >= 0; i--) {
				if(money[i] > max) max = money[i];
				else gain += (max - money[i]);
			}
			
			sb.append(gain +"\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
	}

   //
   public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	}
   
   //
   public static void test08() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st;
   }
}

