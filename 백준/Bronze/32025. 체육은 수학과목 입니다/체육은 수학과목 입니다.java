import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int h = Integer.parseInt(br.readLine()) * 100;
        int w = Integer.parseInt(br.readLine()) * 100;

        System.out.println(Math.min(h, w) / 2);

    }


}