import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
            List<Character> list1 = new ArrayList<>();
            List<Character> list2 = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (Character character : st.nextToken().toCharArray()) {
            	list1.add(character);
			}
            
            for (Character character : st.nextToken().toCharArray()) {
            	list2.add(character);
			}
            
            Collections.sort(list1);
            Collections.sort(list2);

            while(! list1.isEmpty() && ! list2.isEmpty()){
                if (list1.remove(0) != list2.get(0)) break;
                list2.remove(0);
            }

            if (list2.isEmpty()) System.out.println("Possible");
            else System.out.println("Impossible");
		}
		
	}
}
