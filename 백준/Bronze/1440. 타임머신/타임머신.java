import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

   public static void test09() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), ":");
	   
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < 3; i++) list.add(Integer.parseInt(st.nextToken()));
       
       int ans = 0;
	   for (int i = 0; i < 3; i++) {
		   
           ArrayList<Integer> tmp_1 = (ArrayList<Integer>) list.clone();
           
           if (checkHour(list.get(i))) {
        	   
               tmp_1.remove(i);
               for (int j = 0; j < 2; j++) {
            	   
                   ArrayList<Integer> tmp_2 = (ArrayList<Integer>) tmp_1.clone();
                   
                   if (checkTime(tmp_1.get(j))) {
                	   
                       tmp_2.remove(j);
                       if (checkTime(tmp_2.get(0))) ans++;
                   }
               }
           }
       }
	   
	   System.out.println(ans);
   }

   private static boolean checkHour(int time) {
	   
       if (time >= 1 && time <= 12) return true;
       
       return false;
   }

   private static boolean checkTime(int time) {
	   
       if (time >= 0 && time <= 59)  return true;
       
       return false;
   }
}
