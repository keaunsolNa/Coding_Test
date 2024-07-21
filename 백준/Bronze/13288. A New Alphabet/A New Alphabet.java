import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] str = br.readLine().toUpperCase().toCharArray();

        for (char c : str)
        {

            switch (c)
            {

                case 'A' : sb.append("@"); break;
                case 'B' : sb.append("8"); break;
                case 'C' : sb.append("("); break;
                case 'D' : sb.append("|)"); break;
                case 'E' : sb.append("3"); break;
                case 'F' : sb.append("#"); break;
                case 'G' : sb.append("6"); break;
                case 'H' : sb.append("[-]"); break;
                case 'I' : sb.append("|"); break;
                case 'J' : sb.append("_|"); break;
                case 'K' : sb.append("|<"); break;
                case 'L' : sb.append("1"); break;
                case 'M' : sb.append("[]\\/[]"); break;
                case 'N' : sb.append("[]\\[]"); break;
                case 'O' : sb.append("0"); break;
                case 'P' : sb.append("|D"); break;
                case 'Q' : sb.append("(,)"); break;
                case 'R' : sb.append("|Z"); break;
                case 'S' : sb.append("$"); break;
                case 'T' : sb.append("']['"); break;
                case 'U' : sb.append("|_|"); break;
                case 'V' : sb.append("\\/"); break;
                case 'W' : sb.append("\\/\\/"); break;
                case 'X' : sb.append("}{"); break;
                case 'Y' : sb.append("`/"); break;
                case 'Z' : sb.append("2"); break;
                default: sb.append(c); break;

            }
        }

        System.out.print(sb);
    }
}

