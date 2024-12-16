import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> bd = new ArrayList<>();
        
        bd.add("bigdata");
        bd.add("public");
        bd.add("society");
        
        String[] input = br.readLine().split(" ");
       
        boolean flag = false;
        for (String str : input)
        {
        	
        	if (bd.contains(str)) 
        	{
        		flag = true;
        		break;
        	}
        	
        	for (String strs : bd)
        	{
        		if (str.startsWith(strs) || str.endsWith(strs))
        		{
        			flag = true;
        			break;
        		}
        	}
        }

        bw.write(!flag ? "digital humanities" : "public bigdata");
        bw.flush();
        bw.close();
        br.close();
   
    }

}
