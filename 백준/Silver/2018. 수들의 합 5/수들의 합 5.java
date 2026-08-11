import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
       
       // 투포인터 설정
		int start = 0;
		int end = 0; 
		
		//sum: 합
		int sum = 0;
		// cnt: 가지수
		int cnt = 0; 
		
		while(start <= N) {
			//end 증가
			while(++end <= N) { 
				//부분합을 증가
				sum += end; 
				
				if(sum >= N) {
					if(sum == N) cnt++;
					break;
				}
			}
			
			//start 증가
			while(++start <= N) { 
				//부분합을 감소
				sum -= start; 
				if(sum <= N) {
					if(sum == N) cnt++;
					break;
				}
			}	
		}
		
		System.out.println(cnt);
   }
}
