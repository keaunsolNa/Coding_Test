import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int G = Integer.parseInt(br.readLine());
			
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i < G; i++) list.add(Integer.parseInt(br.readLine()));

			if(G == 1) {
				System.out.println(1);
				continue;
			}
			
			int m = 2;
			while(true) {
				
				List<Integer> remainList = new ArrayList<>();
				
				for(int i = 0; i < G; i++) {
					
					int temp = list.get(i) % m;
					
					if(remainList.contains(temp)) break;
					else remainList.add(temp);
				}
				
				if(remainList.size() == G) {
					System.out.println(m);
					break;
				}
				m++;
			}
		}
	}
}
