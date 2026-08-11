import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int people = Integer.parseInt(temp[0]);
		String game = temp[1];
		int maxPeople = 0;
		
		switch(game) {
			case "Y" : maxPeople = 1; break;
			case "F" : maxPeople = 2; break;
			case "O" : maxPeople = 3; break;
		}
		
		Set<String> peopleSet = new HashSet<>();
		for(int i = 0; i < people; i++) {
			peopleSet.add(br.readLine());
		}
		
		System.out.println(peopleSet.size()/maxPeople);

	}
}
