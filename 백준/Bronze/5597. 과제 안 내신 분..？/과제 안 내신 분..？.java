import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 1; i <= 30; i++) {
			arr.add(i);
		}
		
		int cnt = 0;
		
		while(!(cnt == 28)) {
			arr.remove(arr.indexOf(Integer.parseInt(br.readLine())));
			cnt++;
		}
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
	}
}
