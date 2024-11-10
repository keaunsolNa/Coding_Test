import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<String> list = new LinkedList<>();

        while (n --> 0)
        {

            String document = br.readLine();
            if (list.contains(document))
            {
                list.remove(document);
                list.add(document);
            }
            else
            {
                list.add(document);
                if (list.size() > k)
                {
                    list.remove(0);
                }
            }

        }

        for (int i = list.size() - 1; i >= 0; i--)
        {
            bw.write(list.get(i) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

}
