import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        String birth = str.substring(0, 6);

        String front = "";
        if (str.charAt(6) != '-') {

            if (Integer.parseInt(birth.substring(0, 2)) <= 20) front = "19";
            else front = "18";
        }

        else {

            if (Integer.parseInt(birth.substring(0, 2)) <= 20) front = "20";
            else front = "19";
        }
        System.out.println(front + birth + str.substring(7));
    }


}