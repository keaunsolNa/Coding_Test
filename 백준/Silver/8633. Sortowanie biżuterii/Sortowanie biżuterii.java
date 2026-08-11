import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<inputString> list = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {

			list.add(new inputString(br.readLine()));
		}

		while(!list.isEmpty()) System.out.println(list.poll().input);
	}

	private static class inputString implements Comparable<inputString> {
		
		String input;
		
		inputString(String input) {
			this.input = input;
		}

		@Override
		public int compareTo(inputString str) {
			
			if(this.input.length() == str.input.length()) {
				
				return this.input.compareTo(str.input);
			}
			
			else return this.input.length() - str.input.length();
		}
	}
}
