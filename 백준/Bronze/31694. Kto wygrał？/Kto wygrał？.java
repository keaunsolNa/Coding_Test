import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       StringTokenizer st2 = new StringTokenizer(br.readLine());

       int[][] arr = new int[2][11];
       for (int i = 0; i < 18; i++) {

           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st2.nextToken());

           arr[0][0] += a;
           arr[1][0] += b;

           switch (a) {

               case 10 : arr[0][1]++; break;
               case 9 : arr[0][2]++; break;
               case 8 : arr[0][3]++; break;
               case 7 : arr[0][4]++; break;
               case 6 : arr[0][5]++; break;
               case 5 : arr[0][6]++; break;
               case 4 : arr[0][7]++; break;
               case 3 : arr[0][8]++; break;
               case 2 : arr[0][9]++; break;
               case 1 : arr[0][10]++; break;

           }

           switch (b) {

               case 10 : arr[1][1]++; break;
               case 9 : arr[1][2]++; break;
               case 8 : arr[1][3]++; break;
               case 7 : arr[1][4]++; break;
               case 6 : arr[1][5]++; break;
               case 5 : arr[1][6]++; break;
               case 4 : arr[1][7]++; break;
               case 3 : arr[1][8]++; break;
               case 2 : arr[1][9]++; break;
               case 1 : arr[1][10]++; break;
           }

       }

       for (int i = 0; i <= 10; i++) {

           if(arr[0][i] > arr[1][i]) {
               System.out.println("Algosia");
               return;
           }

           else if (arr[0][i] < arr[1][i]) {
               System.out.println("Bajtek");
               return;
           }
       }

        System.out.println("remis");
    }
}