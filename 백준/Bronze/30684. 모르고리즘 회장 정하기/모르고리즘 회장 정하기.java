import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
public class Main {


    public static class Name implements Comparable<Name>{
		
		String name;
		
		public Name(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Name o) {
			
			return this.name.compareTo(o.name);
		}
	}
   
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Name> name = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {

			String temp = br.readLine();
			
			if(temp.length() == 3) name.add(new Name(temp));
		}
		
		System.out.println(name.poll().name);
   }
}