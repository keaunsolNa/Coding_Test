import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Set<Integer> number = new HashSet<>();
		List<Integer> list = new ArrayList<>(N);
	
		while(N --> 0) {
			int temp = Integer.parseInt(br.readLine());
			number.add(temp);
			list.add(temp);
		}
		
		int prev = list.get(0);
		int length = 1;
		int maxLength = 1;
		for(int i = 1; i < list.size(); i++) {
			if(prev == list.get(i)) {
				length++;
				maxLength = Math.max(maxLength, length);
			} else length = 1;
			
			prev = list.get(i);
		}
		
		Iterator<Integer> iter = number.iterator();
		
		while(iter.hasNext()) {
			List<Integer> cloneList = new ArrayList<>(list);
			cloneList.removeAll(Arrays.asList(iter.next()));
		
			prev = cloneList.get(0);
			length = 1;
			
			for(int i = 1; i < cloneList.size(); i++) {
				if(prev == cloneList.get(i)) {
					length++;
					maxLength = Math.max(maxLength, length);
				} else length = 1;
				
				prev = cloneList.get(i);
			}
			
		}
		
		System.out.println(maxLength);
	}
}
