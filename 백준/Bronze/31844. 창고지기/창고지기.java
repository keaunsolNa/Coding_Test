import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String input = br.readLine();

        int robot = input.indexOf('@');
        int box = input.indexOf('#');
        int target = input.indexOf('!');

        if (robot < box && box < target) {

            System.out.println(target - robot - 1);
        }

        else if (target < box && box < robot) {

            System.out.println(robot - target - 1);

        }

        else System.out.println(-1);

    }


}
