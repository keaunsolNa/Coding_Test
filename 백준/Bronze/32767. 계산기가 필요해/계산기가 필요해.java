import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	String[] str = br.readLine().split(" ");
    	
    	double num1 = Double.parseDouble(str[0]);
    	char oper1 = str[1].charAt(0);
    	double num2 = Double.parseDouble(str[2]);
    	char oper2 = str[3].charAt(0);
    	double num3 = Double.parseDouble(str[4]);

    	double res = calc(num1, oper1, num2);
    	
    	res = calc(res, oper2, num3);
       
    	bw.write("=================\n");
    	bw.write("|SASA CALCULATOR|\n");
    	
    	StringBuilder sb = new StringBuilder();

    	sb.append("|");
    	sb.append(String.format("%.3f", res));
    	sb.append("|\n");
    	
    	while (sb.length() != 18)
    	{
    		sb.insert(1, " ");
    	}
    	
    	bw.write(sb.toString());
    	bw.write("-----------------\n");
    	bw.write("|               |\n");
        bw.write("| AC         /  |\n");
        bw.write("| 7  8  9    *  |\n");
        bw.write("| 4  5  6    -  |\n");
        bw.write("| 1  2  3    +  |\n");
        bw.write("|    0  .    =  |\n");
        bw.write("=================");
        
        bw.flush();
        bw.close();
        br.close();

    }
    
    private static double calc(double a, char b, double c)
    {
    	
    	switch (b)
    	{
	    	case '+' : return a + c;
	    	case '-' : return a - c;
	    	case '*' : return a * c;
	    	default  : return a / c;
    	}
    }
    
}
