import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		
		int t = Integer.parseInt(br.readLine());
		
		while (t --> 0) {
			
			br.readLine();
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			List<Integer> godzilla = new ArrayList<>();
			for (int i = 0; i < n; i++) godzilla.add(Integer.parseInt(st.nextToken()));
			
			st = new StringTokenizer(br.readLine());
			List<Integer> mechaGodzilla = new ArrayList<>();
			for (int i = 0; i < m; i++) mechaGodzilla.add(Integer.parseInt(st.nextToken()));

			
			Collections.sort(godzilla);
			Collections.sort(mechaGodzilla);

			while (!(godzilla.isEmpty() || mechaGodzilla.isEmpty())) {
				
				if (godzilla.get(0) < mechaGodzilla.get(0)) godzilla.remove(0);
				else mechaGodzilla.remove(0);
			}
			
			sb.append(godzilla.isEmpty() ? "MechaGodzilla" : "Godzilla").append("\n");
				
		}
		
		System.out.println(sb);
		
   }
}