import java.util.*;

class Solution {
	public String reverseWords(String s) {

		StringTokenizer st = new StringTokenizer(s);
		StringBuilder out = new StringBuilder();

		while (st.hasMoreTokens()) {

			StringBuilder sb = new StringBuilder(st.nextToken());
			sb.reverse();
			out.append(sb);

			if (st.hasMoreTokens()) out.append(" ");
		}

		return out.toString();
	}
}