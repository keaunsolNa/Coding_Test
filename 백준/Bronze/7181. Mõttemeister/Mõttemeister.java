import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       char[] number = br.readLine().toCharArray();
       int n = Integer.parseInt(br.readLine());

       for (int i = 0; i < n; i++) {

           char[] question = br.readLine().toCharArray();

           int ans1 = 0;
           int ans2 = 0;
           for (int j = 0; j < 4; j++) {

               if(number[j] == question[j]) ans2++;

               for (int q = 0; q < 4; q++) {

                   if (question[j] == number[q]) {
                       ans1++;
                       break;
                   }
               }
           }

           System.out.println(ans1 + " " + ans2);
       }


    }


}