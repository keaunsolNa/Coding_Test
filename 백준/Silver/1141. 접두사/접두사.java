import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	   int N = Integer.parseInt(br.readLine());
	   String[] arr = new String[N];
	   Set<String> set = new HashSet<>();
	   for(int i = 0; i < N; i++) arr[i] = br.readLine();
	   
	   for(int i = 0; i < N; i++) {
		   
		   String temp = arr[i];
		   int cnt = 0;
		   
		   for(int j = 0; j < N; j++) {
			   
			   if(i != j) {
				   
				   String temp2 = arr[j];
				   
				   if(temp.length() <= temp2.length()) {
					   
					   for(int k = 0; k < temp.length(); k++ ) {
						   
						   if(temp.equals(temp2)) {
							   cnt++;
							   break;
						   }
						   
						   if(!temp2.startsWith(temp)) {
							   cnt++;
							   break;
						   }
					   }
					   
				   } else cnt++;
			   }
			   
		   }

		   if(cnt == N - 1) set.add(temp);
	   }
	   
	   System.out.println(set.size());
   }
}