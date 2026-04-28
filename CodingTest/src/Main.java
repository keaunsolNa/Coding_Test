import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {


		int[] nums1 = new int[]{1,2,2,1};
		int[] nums2 = new int[]{1,1};

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {

			map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
		}

		System.out.println(map);
		List<Integer> list = new ArrayList<>();

		for (int j : nums2) {

			if (map.containsKey(j)) {

				if (map.get(j) > 0) {
					list.add(j);
					map.put(j, map.get(j) - 1);
				}
				else {
					map.remove(j);
				}
			}

			System.out.println(map + " " + j);

		}

		int[] array = list.stream()
		.mapToInt(Integer::intValue)
		.toArray();

		System.out.println(list);


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