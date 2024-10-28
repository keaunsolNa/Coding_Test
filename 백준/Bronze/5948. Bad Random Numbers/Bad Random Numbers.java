import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        Set<Integer[]> set = new HashSet<>();
        Integer[] arrOne = makeArray(input);
        Integer[] prevTarget = arrOne.clone();
        set.add(arrOne);
        int idx = 1;
        
        while (true) 
        {
        	
        	Integer[] arrTemp = makeArray(prevTarget[2] + "");
        	if (isDup(set, arrTemp))
        	{
        		bw.write(String.valueOf(idx));
        		break;
        	}
        	else
        	{
        		idx++;
        		set.add(arrTemp);
        		prevTarget = arrTemp.clone();
        	}
        	
        }


        bw.flush();
        bw.close();
        br.close();

    }

    private static Integer[] makeArray(String number)
    {
    	
    	Integer[] arr = new Integer[3];
    	
    	arr[0] = Integer.parseInt(number);
    	
    	if (number.length() == 4)
    	{
        	arr[1] = Integer.parseInt(number.substring(1, 3));    		
    	}
    	else 
    	{
    		
    		while(number.length() != 4)
    		{
    			number = "0" + number;
    		}
        	arr[1] = Integer.parseInt(number.substring(1, 3));
    	}

    	arr[2] = arr[1] * arr[1];
    	
    	return arr;
    }
    
    private static boolean isDup(Set<Integer[]> set, Integer[] arrTemp)
    {
    	for (Integer[] arr : set)
    	{
    		
    		if (Arrays.equals(arr, arrTemp)) return true;
    	}
    	
    	return false;
    }

}
