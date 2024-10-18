import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        
       
        while (tc --> 0)
        {
        	
        	br.readLine();
        	int n = Integer.parseInt(br.readLine());

        	Map<Integer, Integer> ezraCornell = new HashMap<>();
        	Map<Integer, Integer> whiteHosted = new HashMap<>();
        	
        	st = new StringTokenizer(br.readLine());
        	for (int i = 0; i < n; i++) 
        	{
        		int key = Integer.parseInt(st.nextToken());
        		ezraCornell.put(key, ezraCornell.getOrDefault(key, 0) + 1);
        	}

        	int[] arrA = new int[ezraCornell.size()];
        	int idx = 0;
        	
        	for (Integer key : ezraCornell.keySet())
        	{
        		arrA[idx++] = ezraCornell.get(key);
        	}
        	
        	Arrays.sort(arrA);
        	
        	st = new StringTokenizer(br.readLine());
        	for (int i = 0; i < n; i++) 
        	{
        		int key = Integer.parseInt(st.nextToken());
        		whiteHosted.put(key, whiteHosted.getOrDefault(key, 0) + 1);
        	}
        	
        	int[] arrB = new int[whiteHosted.size()];
        	idx = 0;
        	
        	for (Integer key : whiteHosted.keySet())
        	{
        		arrB[idx++] = whiteHosted.get(key);
        	}
        	
        	Arrays.sort(arrB);

        	if (arrA.length != arrB.length)
        	{
        		bw.write("you've messed up, Cornell");
        	}
        	else
        	{
        		
        		boolean flag = true;
        		for (int i = 0; i < arrA.length; i++)
        		{
        			
        			if (arrA[i] != arrB[i]) 
        			{
        				flag = false;
        				break;
        			}
        		}
        		
        		if (flag) bw.write("what a lovely party");
        		else bw.write("you've messed up, Cornell");
        			
        	}
        	
        	bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }


}
