import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        List<Integer> list = new ArrayList<>();
        if (input.contains("I")) list.add(1);
        if (input.contains("II")) list.add(2);
        if (input.contains("III")) list.add(3);
        if (input.contains("IV")) list.add(4);
        if (input.contains("V")) list.add(5);
        if (input.contains("VI")) list.add(6);
        if (input.contains("VII")) list.add(7);
        if (input.contains("VIII")) list.add(8);
        if (input.contains("IX")) list.add(9);
        if (input.contains("X")) list.add(10);
        if (input.contains("XI")) list.add(11);
        if (input.contains("XII")) list.add(12);

        Collections.sort(list);

        for (int i : list)
        {
            bw.write(i + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

}
