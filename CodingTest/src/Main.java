import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {


		int n = 9;
		List<Long> list = new ArrayList<>();
		long start = 3;
		list.add(start);

		while (start <= 2.147483647E9)
		{
			start *= 3;
			list.add(start);
		}

		System.out.println(list);
		System.out.println(list.contains(n));

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