import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = br.readLine().charAt(0);
		int i = (int)'I';
		int l = (int)'L';
		int o = (int)'O';
		int v = (int)'V';
		int e = (int)'E';
		int y = (int)'Y';
		int n = (int)'N';
		int s = (int)'S';
		
		int answer = 0;
		answer += Math.abs(i - c);
		c = i;
		answer += Math.abs(l - c);
		c = l;
		answer += Math.abs(o - c);
		c = o;
		answer += Math.abs(v - c);
		c = v;
		answer += Math.abs(e - c);
		c = e;
		answer += Math.abs(y - c);
		c = y;
		answer += Math.abs(o - c);
		c = o;
		answer += Math.abs(n - c);
		c = n;
		answer += Math.abs(s - c);
		c = s;
		answer += Math.abs(e - c);
		c = e;
		answer += Math.abs(i - c);
		c = i;
		
		System.out.println(answer);
	}
}
