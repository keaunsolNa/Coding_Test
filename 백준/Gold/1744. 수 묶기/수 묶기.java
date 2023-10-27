import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> plus = new ArrayList<>();
		List<Integer> minus = new ArrayList<>();
		
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n > 0) plus.add(n); else minus.add(n);
		}
		
		Collections.sort(plus, Collections.reverseOrder());
		Collections.sort(minus);
		
		int sum = 0;
		int i = 0;
		while(i < plus.size()) {
			
			if(i + 1 < plus.size() && plus.get(i) != 1 && plus.get(i + 1) != 1) sum += plus.get(i++) * plus.get(i++); 
			else sum += plus.get(i++);
		}
		
		i = 0;
		while(i < minus.size()) {
			
			if(i + 1 < minus.size() && minus.get(i) != 1 && minus.get(i + 1) != 1) sum += minus.get(i++) * minus.get(i++); 		
            else sum += minus.get(i++);
		}
		
		System.out.println(sum);
   }
}