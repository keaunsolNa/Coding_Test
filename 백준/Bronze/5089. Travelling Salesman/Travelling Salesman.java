import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = 0;
		
		while(true) {
			
			int t = Integer.parseInt(br.readLine());
			if(t == 0) break;
			
			Set<String> set = new HashSet<>();
			for(int i = 0; i < t; i++) set.add(br.readLine());
			
			System.out.println("Week " + (++tc) + " " + set.size());
		}
	}
}
