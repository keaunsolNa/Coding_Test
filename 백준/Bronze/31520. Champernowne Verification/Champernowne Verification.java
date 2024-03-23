import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        for (int i = 0; i < n.length(); i++) {

            if(Character.getNumericValue(n.charAt(i)) != i + 1) {

                System.out.println(-1);
                return;
            }
        }

        System.out.println(n.charAt(n.length() - 1));
    }


}