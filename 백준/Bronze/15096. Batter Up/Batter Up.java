import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static long sum;

	public static void main(String[] args) throws IOException {
		test04();
	}

	public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<Integer>();
        
        for (String s : input) {
            int n = Integer.parseInt(s);
            if (n != -1) list.add(n);
        }

        double sum = 0;
        for (int i : list) sum += i;
        
        System.out.println(sum / list.size());
	}
}
