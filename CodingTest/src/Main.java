import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {


		String[] words = new String[] {"Hello","Alaska","Dad","Peace"};

		List<char[]> list1 = List.of("qwertyuiop".toCharArray());
		List<char[]> list2 = List.of("asdfghjkl".toCharArray());
		List<char[]> list3 = List.of("zxcvbnm".toCharArray());

		for (char[] chars : list1) {
			System.out.println(Arrays.toString(chars));
		}
		for (String word : words) {

			word = word.toLowerCase();
			List<char[]> list = List.of(word.toCharArray());


			if (list1.contains(Arrays.asList(word.toCharArray())) ||
				list2.contains(Arrays.asList(word.toCharArray())) ||
				list3.contains(Arrays.asList(word.toCharArray()))) {
				System.out.println(word);
			}

		}


		bw.flush();
        bw.close();
        br.close();

    }

    private static boolean solve(int n) throws IOException {

		while (n > 2)
		{
			System.out.printf("n = %d\n", n);
			if (n == 2) return true;
			if (n % 2 != 0) return false;
			n /= 2;
		}

		return n == 1 || n == 2;
    }



}