import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;

        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        while(n --> 0)
        {

            char[] arr = br.readLine().toCharArray();
            sb = new StringBuilder();

            for (char c : arr)
            {
                int i = c;

                if (i >= 65 && i <= 90)
                {
                    switch (c)
                    {
                        case 'A' :
                        case 'B' :
                        case 'C' : sb.append("2"); break;
                        case 'D' :
                        case 'E' :
                        case 'F' : sb.append("3"); break;
                        case 'G' :
                        case 'H' :
                        case 'I' : sb.append("4"); break;
                        case 'J' :
                        case 'K' :
                        case 'L' : sb.append("5"); break;
                        case 'M' :
                        case 'N' :
                        case 'O' : sb.append("6"); break;
                        case 'P' :
                        case 'R' :
                        case 'S' : sb.append("7"); break;
                        case 'T' :
                        case 'U' :
                        case 'V' : sb.append("8"); break;
                        case 'W' :
                        case 'X' :
                        case 'Y' : sb.append("9"); break;
                    }
                }

                else if (i >= 48 && i <= 57)
                {
                    sb.append(c);
                }

                if (sb.length() == 3) sb.append("-");
            }

            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
        }

        boolean flag = false;
        for (String key : map.keySet())
        {
            if (map.get(key) > 1)
            {
                flag = true;
                bw.write(key + " " + map.get(key) + "\n");
            }

        }

        if (!flag)
        {
            System.out.println("No duplicates.");
        }
        else
        {
            bw.flush();
            bw.close();
        }


        br.close();
    }

}
