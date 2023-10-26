import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] F = br.readLine().split(" ");
		String[] M = br.readLine().split(" ");
		
		Set<String> set = new TreeSet<>();
		for(int i = 0; i < F.length; i++) {
			
			for(int j = 0; j < M.length; j++) {
				set.add(F[i] + " " + M[i]);
				set.add(F[i] + " " + M[j]);
				set.add(F[j] + " " + M[i]);
				set.add(F[j] + " " + M[j]);
				set.add(F[i] + " " + F[j]);
				set.add(F[j] + " " + F[i]);
				set.add(M[i] + " " + F[i]);
				set.add(M[i] + " " + F[j]);
				set.add(M[j] + " " + F[i]);
				set.add(M[j] + " " + F[j]);
				set.add(M[i] + " " + M[j]);
			}
		}

		for (String string : set) System.out.println(string);
   }
}