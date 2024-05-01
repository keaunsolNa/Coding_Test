import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {


    private static final List<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String input = "";
        int max = 0;
        List<Integer> list = new ArrayList<>();
        while ((input = br.readLine()) != null) {

            int temp = input.length();
            max = Math.max(temp, max);
            list.add(temp);

        }

        int total = 0;
        for (int i = 0; i < list.size() - 1; i++) {

            total += (max - list.get(i)) * (max - list.get(i));
        }

        System.out.println(total);
    }
}
