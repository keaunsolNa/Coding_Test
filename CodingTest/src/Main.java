import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		Map<Integer, Integer> map = new HashMap<>();

		int[] colors = {1,8,3,8,3};


		for (int i = 0; i < colors.length; i++) {

			int target = colors[i];
			if (!map.containsKey(target)) map.put(target, i);
		}


		System.out.println(map);
		int max = 0;
		for (int i : map.keySet())
		{
			int dis = 0;
			for (int j : map.keySet())
			{
				System.out.println(i + " " + j);
				if (i != j) dis = map.get(j) - map.get(i);
				max = Math.max(max, dis);
			}
		}

		bw.write(String.valueOf(max));
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