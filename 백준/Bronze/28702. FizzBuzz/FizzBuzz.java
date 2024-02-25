import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[3];
        int number = 0, idx = 0;

        for(int i = 0; i < 3; i++) {

            String str = br.readLine();
            if(str.equals("FizzBuzz") || str.equals("Fizz") || str.equals("Buzz"))
                input[i] = str;

            else {
                input[i] = str;
                idx = i;
                number = Integer.parseInt(str);
            }

        }

        int term = 3 - idx;
        int target = number + term;

        if(target % 3 == 0 && target % 5 == 0) System.out.println("FizzBuzz");
        else if(target % 3 == 0) System.out.println("Fizz");
        else if(target % 5 == 0) System.out.println("Buzz");
        else System.out.println(target);


    }


}