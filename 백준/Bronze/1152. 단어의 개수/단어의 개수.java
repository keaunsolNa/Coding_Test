import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		test04();
	}

	public static void test04() {
		Scanner sc = new Scanner(System.in);
		String[] testString = sc.nextLine().split(" ");
		
		List<String> stringList = new ArrayList<>();
		for(int i = 0; i < testString.length; i++) {
			if(!testString[i].equals("")) {
				stringList.add(testString[i]);
			}
		}
		
		System.out.println(stringList.size());
	}
}
