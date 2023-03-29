package baekjoon_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BruteForcePlus06 {
	
   public static void main(String[] args) throws IOException {
      test03();
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
	
	//
	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
	}


}

