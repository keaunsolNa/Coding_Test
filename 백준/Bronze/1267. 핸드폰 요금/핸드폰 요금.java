import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

   public static void test03() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int time = 0;
      int yTime = 0;
      int mTime = 0;
      
      for(int i = 0; i < N; i++) {
    	  time = Integer.parseInt(st.nextToken());
    	  if(time < 30) {
    		  yTime += 10;
    	  } else {
			  yTime += (time/30 + 1) * 10;
    	  }
    	  
    	  if(time < 60) {
    		  mTime += 15;
    	  } else {
    		  mTime += (time/60 + 1)* 15;
    	  }
      }	  
      
	  if(mTime > yTime) {
		  System.out.println("Y " + yTime);
	  } else if(mTime < yTime) {
		  System.out.println("M " + mTime);
	  } else {
		  System.out.println("Y M " + mTime);
	  }
      
   }
}
