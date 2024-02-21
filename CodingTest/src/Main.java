import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        switch (n) {

            case 1 :
                System.out.print(12 + " " + 1600); break;
            case 2 :
                System.out.print(11 + " " + 894); break;
            case 3 :
                System.out.print(11 + " " + 1327); break;
            case 4 :
                System.out.print(10 + " " + 1311); break;
            case 5 :
                System.out.print(9 + " " + 1004); break;
            case 6 :
                System.out.print(9 + " " + 1178); break;
            case 7 :
                System.out.print(9 + " " + 1357); break;
            case 8 :
                System.out.print(8 + " " + 837); break;
            case 9 :
                System.out.print(7 + " " + 1055); break;
            case 10 :
                System.out.print(6 + " " + 556); break;
            case 11 :
                System.out.print(6 + " " + 773);
        }
    }

}