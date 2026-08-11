import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static long[] gomgom = new long[3];
	private static long[] mealTicket = new long[3];

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		gomgom[0] = Long.parseLong(st.nextToken());
		gomgom[1] = Long.parseLong(st.nextToken());
		gomgom[2] = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		mealTicket[0] = Long.parseLong(st.nextToken());
		mealTicket[1] = Long.parseLong(st.nextToken());
		mealTicket[2] = Long.parseLong(st.nextToken());
		
		long ans = 0;
		
		ans = solve(ans);
		System.out.println(ans);
		
	}

	private static long solve(long ans) {
		
		for(int i = 0; i < 3; i++) {
			
			if(gomgom[i] <= mealTicket[i]) {
				mealTicket[i] -= gomgom[i];
				ans += gomgom[i];
				gomgom[i] = 0;
				
			}
			
			else {
				gomgom[i] -= mealTicket[i];
				ans += mealTicket[i];
				mealTicket[i] = 0;
			}
			
		}

		for(int i = 0; i < 3; i++) {
			if(gomgom[i] > 0 && mealTicket[i - 1 < 0 ? 2 : i - 1] >= 3) {
				
				if(gomgom[i] * 3 >= mealTicket[i - 1 < 0 ? 2 : i - 1]) {
					
					ans += mealTicket[i - 1 < 0 ? 2 : i - 1] / 3;
					gomgom[i] -= mealTicket[i - 1 < 0 ? 2 : i - 1] / 3;
					mealTicket[i - 1 < 0 ? 2 : i - 1] = 0;
					
				} else {
					
					ans += gomgom[i];
					mealTicket[i - 1 < 0 ? 2 : i - 1] -= gomgom[i] * 3;
					gomgom[i] = 0;
					
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			if(gomgom[i] > 0 && mealTicket[i + 1 > 2 ? 0 : i + 1] >= 9) {
				
				if(gomgom[i] * 9 >= mealTicket[i + 1 > 2 ? 0 : i + 1]) {
					
					ans += mealTicket[i + 1 > 2 ? 0 : i + 1] / 9;
					gomgom[i] -= mealTicket[i + 1 > 2 ? 0 : i + 1] / 9;
					mealTicket[i + 1 > 2 ? 0 : i + 1] = 0;
					
				} else {
					
					ans += gomgom[i];
					mealTicket[i + 1 > 2 ? 0 : i + 1] -= gomgom[i] * 9;
					gomgom[i] = 0;
					
				}
			}
		}
		return ans;
	}
}
