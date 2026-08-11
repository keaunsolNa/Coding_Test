import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		test04();
	}

    public static void test04() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String temp = br.readLine();
			if(temp.equals("0")) {
				break;
			}
			int answer = 0;
			for(int i = 0; i < temp.length()/2; i++) {
				if(!(temp.charAt(i) == temp.charAt(temp.length() - (i+1)))) answer++;
			}
			if(answer > 0) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
    }
}
