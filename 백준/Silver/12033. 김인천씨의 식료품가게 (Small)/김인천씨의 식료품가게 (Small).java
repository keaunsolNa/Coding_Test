import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for(int i = 1; i <= T; i++) {
			List<Product> p = new ArrayList<>();
			
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 2 * N; j++) {
				int price = Integer.parseInt(st.nextToken());
				boolean chk = false;
				
				p.add(new Product(price, chk));
			}
			
			for(int j = 0; j < 2 * N; j++) {

				if(!p.get(j).chk) {
					
					for(int k = j + 1; k < 2 * N; k++) {
						
						if(!p.get(k).chk) {
							
							int tempSale = (int)(p.get(k).price * 0.75);
							
							if(p.get(j).price == tempSale) {
								p.get(k).chk = true;
								break;
							}
							else if(tempSale > p.get(j).price) break;
						}
						
					}
				}
			}
			
			sb.append("Case #" + i +": ");
			for(int j = 0; j < p.size(); j++) {
				
				if(!p.get(j).chk) sb.append(p.get(j).price + " ");
			}
			sb.append("\n");
			
		}
		
		System.out.println(sb);
	}

	private static class Product{
		
		int price;
		boolean chk;
		
		private Product(int price, boolean chk) {
			this.price = price;
			this.chk = chk;
		}
	}
}
