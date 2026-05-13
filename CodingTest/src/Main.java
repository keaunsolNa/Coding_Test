import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {


		int[] nums = new int[] {0,2,3,4,6,8,9};

		System.out.println(summaryRanges(nums));

		bw.flush();
        bw.close();
        br.close();

		int[] pos = new int[2];
		String moves = "UDRR";
		
		for (char c : moves.toCharArray()) {

			switch(c) {
				case 'U' : pos[0]++;
					break;
				case 'D' : pos[0]--;
					break;
				case 'R' : pos[1]++;
					break;
				case 'L' : pos[1]--;
					break;
			}
		}


	}

	public static List<String> summaryRanges(int[] nums) {

		if (nums.length == 0) return new ArrayList<>();

		List<String> list = new ArrayList<>();
		Deque<Long> dq = new ArrayDeque<>();
		dq.add((long) nums[0]);

		/*
			int[] nums = new int[] {0,1,2,4,5,7};
		 */
		for (int i = 1; i < nums.length; i++) {

			/*
				deque에 쌓인 최신 값 + 1 이 현재값이 아닐 때 (연속성이 끊길 때)
			 */
			if (dq.peekLast() + 1 != nums[i]) {

				if (dq.size() == 1) {
					list.add(String.valueOf(dq.peekLast()));
				}

				else {
					list.add(dq.pollFirst() + "->" + dq.peekLast());
				}

				dq.clear();
				dq.add((long) nums[i]);

			}
			else {
				dq.add((long) nums[i]);
			}

			System.out.println(nums[i] + " " + list);
		}

		System.out.println(dq);

		if (!dq.isEmpty())
		{
			if (dq.size() == 1) list.add(String.valueOf(dq.pop()));
			else {
				list.add(dq.pollFirst() + "->" + dq.pollLast());
			}
		}

		return list;
	}


}