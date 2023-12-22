import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	private static class PPI implements Comparable<PPI> {
		
		int idx;
		int ppi;
		
		private PPI(int idx, int w, int h) {
			this.idx = idx;
			ppi = w * w + h * h;
		}
		
		@Override
		public int compareTo(PPI o) {
			if(this.ppi == o.ppi) return this.idx - o.idx;
			return (o.ppi - this.ppi);
		}
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int idx = 0;
		PriorityQueue<PPI> ppi = new PriorityQueue<>();
		
		while (n-- > 0) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			ppi.add(new PPI(++idx, w, h));
		}

		while(!ppi.isEmpty()) {
			
			System.out.println(ppi.poll().idx);
		}
   }
}