import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	  
	   st = new StringTokenizer(br.readLine());
       int A = Integer.parseInt(st.nextToken());
       int B = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(br.readLine());
       
       int[] arr = new int[m + 1];
       st = new StringTokenizer(br.readLine());
       for (int i = 1; i <= m; i++) arr[i] = Integer.parseInt(st.nextToken());
       
       int ten = 0;
       for (int i = 1; i <= m; i++) ten += arr[i] * Math.pow(A, m - i);

       Stack<Integer> stack = new Stack<>();

       while (ten != 0) {
    	   
           stack.push(ten % B);
           ten /= B;

       }

       // 진법 변환
       while (!stack.isEmpty()) {

    	   if (stack.size() == 1) sb.append(stack.peek() + "\n");
           else sb.append(stack.peek() + " ");

           stack.pop();

       }
       
       System.out.println(sb);
	   
   }
}
