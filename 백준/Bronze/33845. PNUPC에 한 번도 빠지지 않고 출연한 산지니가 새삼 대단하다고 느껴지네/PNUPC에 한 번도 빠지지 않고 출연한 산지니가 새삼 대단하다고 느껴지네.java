import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Character> inputSet = br.readLine()
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toSet());

        String str = br.readLine();

        for (char c : inputSet) {
            str = str.replaceAll(String.valueOf(c), "");
        }

        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }


}