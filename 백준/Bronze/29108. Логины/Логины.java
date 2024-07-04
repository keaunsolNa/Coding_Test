import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();

        if (input.length() < 3) {
            System.out.println("Incorrect");
            return;
        }
        String io = input.substring(0, 2);
        String el = input.substring(2);

        if (io.equals("io")) {

            try {

                int temp = Integer.parseInt(el);

                System.out.println("Correct");

            } catch (Exception e) {

                System.out.println("Incorrect");
            }

        } else {

            System.out.println("Incorrect");
        }



    }


}