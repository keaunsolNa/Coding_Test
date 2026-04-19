import java.io.*;
import java.util.*;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {

		int[] nums1 = new int[] {55,30,5,4,2};
		int[] nums2 = new int[] {100,20,10,10,5};
		int max = 0;

		for (int i = 0; i < nums2.length; i++) {

			int left = 0;
			int right = nums2.length - 1;

			while (left <= right) {

				int mid = (left + right) / 2;

				if (nums2[mid] >= nums1[i]) {
					max = Math.max(mid - i, max);
					left = mid + 1;
				}

				else if (nums2[mid] < nums1[i]) {
					right = mid - 1;
				}
				else {
					left = mid + 1;
				}
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