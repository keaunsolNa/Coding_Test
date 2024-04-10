import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String tempStr = "qwertasdfgzxcvb";
        List<Character> left = new ArrayList<>();
        for (int i = 0; i < tempStr.length(); i++) left.add(tempStr.charAt(i));

        tempStr = "yuiophjklnm";
        List<Character> right = new ArrayList<>();
        for (int i = 0; i < tempStr.length(); i++) right.add(tempStr.charAt(i));

        char[] input = br.readLine().toCharArray();
        boolean temp = left.contains(input[0]);
        boolean Dickensian = true;

        for (int i = 1 ;i < input.length; i++) {

            if (temp) {

                if (!right.contains(input[i])) {
                    Dickensian = false;
                    break;
                }

                temp = false;
            }

            else {

                if (!left.contains(input[i])) {
                    Dickensian = false;
                    break;
                }
                temp = true;
            }
        }

        System.out.println(Dickensian ? "yes" : "no");
    }


}
