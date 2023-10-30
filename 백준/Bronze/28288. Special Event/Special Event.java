import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[5];
		int max = 0;
		
		for(int i = 0; i < N; i++) {
			
			String input = br.readLine();
			
			for(int j = 0; j < 5; j++) {
				
				arr[j] += input.charAt(j) == 'Y' ? 1 : 0;
				max = Math.max(max, arr[j]);
				
			}
		}

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++) if(arr[i] == max) list.add(i + 1);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if(i + 1 < list.size()) System.out.print(",");
		}
   }
}