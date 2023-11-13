import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			
			if(input.equals("Present!")) list.remove(list.size() - 1);
			else list.add(input);
		}

		if(list.size() == 0) sb.append("No Absences");
		else {
			for(int i = 0; i < list.size(); i++) sb.append(list.get(i) + "\n");
			sb.deleteCharAt(sb.length() - 1);
		}
		
		System.out.print(sb);
   }
}