import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test01();
	}

	public static void test01() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int ans = 0;
		while(true) {
		
			input = br.readLine();
			if(input.equals("고무오리 디버깅 끝")) break;
			if(input.equals("문제")) ans++;
			if(input.equals("고무오리")) {
				
				if(ans > 0) ans--;
				else ans += 2;
			}
			
		}
		
		if(ans == 0) System.out.println("고무오리야 사랑해");
		else System.out.println("힝구");
	}
}
