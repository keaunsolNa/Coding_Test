import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

       int[] arrOne = Arrays.copyOf(arr, l - 1);
       int[] arrTwo = Arrays.copyOfRange(arr, l - 1, r);
       int[] arrThr = Arrays.copyOfRange(arr, r , arr.length);
       
       Arrays.sort(arrTwo);
       
       int[] arrF = IntStream.concat(IntStream.of(arrOne), IntStream.of(IntStream.concat(IntStream.of(arrTwo), IntStream.of(arrThr)).toArray())).toArray();

       boolean flag = true;
       int prev = arrF[0];
       for (int i = 1; i < n; i++)
       {
    	   if (prev > arrF[i])
    	   {
    		   flag = false;
    		   break;
    	   }
    	   prev = arrF[i];
       }
       
       
       bw.write(!flag ? "0" : "1");
       bw.flush();
       bw.close();
       br.close();

    }


}
