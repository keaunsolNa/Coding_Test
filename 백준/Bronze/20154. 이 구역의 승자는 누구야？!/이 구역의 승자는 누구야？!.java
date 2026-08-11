import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

   public static void test06() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int[] number = new int[] {3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
	   
	   String input = br.readLine();
	   List<Integer> arr = new ArrayList<>();
	   
	   for(int i = 0; i < input.length(); i+= 2) {
		   
		   if(i != input.length() - 1) arr.add(number[input.charAt(i) - 'A'] + number[input.charAt(i + 1) - 'A']);
		   else arr.add(number[input.charAt(i) - 'A']);
		   
	   }
	   
	   while(arr.size() != 1) {
		   
		   List<Integer> arr2 = new ArrayList<>();
		   for(int i = 0; i < arr.size(); i += 2) {
			   
			   if(i != arr.size() - 1) {
				   
				   if(arr.get(i) + arr.get(i + 1) < 10) arr2.add(arr.get(i) + arr.get(i + 1));
				   else arr2.add((arr.get(i) + arr.get(i + 1)) % 10);
				   
			   } else arr2.add(arr.get(i));
			   
		   }
		   arr = arr2;
	   }
	   
	   if(arr.get(0) % 2 == 0) System.out.println("You're the winner?");
	   else System.out.println("I'm a winner!");
   }
}
