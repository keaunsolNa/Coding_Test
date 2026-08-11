import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			
			int K = Integer.parseInt(br.readLine());
			String name = br.readLine();
			boolean peasoup = false;
			boolean pancakes = false;

			for(int j = 0; j < K ; j++) {
				String menu = br.readLine();
				
				if(menu.equals("pancakes")) pancakes = true;
				if(menu.equals("pea soup")) peasoup = true;
				
			}
			
			if(pancakes && peasoup) {
				System.out.print(name);
				return;
			}
			
		}
		
		System.out.print("Anywhere is fine I guess");
	}
}
