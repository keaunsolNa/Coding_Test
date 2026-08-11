import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

   public static void test10() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());	
	   
	   int N = Integer.parseInt(st.nextToken());
	   int M = Integer.parseInt(st.nextToken());
	   
	   Map<Integer, Integer> map = new HashMap<>();
	   for(int i = 1; i <= N; i++) {
		   
		   for(int j = M; j >= 1; j--) {
			   map.put(i + j, map.getOrDefault(i + j, 0) + 1);
		   }
	   }
	   
	   List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
	   entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
	       @Override
	       public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
	    	   return o2.getValue() - o1.getValue();
	       }
	   });
	   
	   int first = entryList.get(0).getValue();
	   for(Map.Entry<Integer, Integer> entry : entryList){
		   if(entry.getValue() == first) System.out.println(entry.getKey());
		   else return;
	   }
   
   }
}
