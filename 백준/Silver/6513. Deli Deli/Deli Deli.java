import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        
        Map<String, String> irregular = new HashMap<>();
        
        for (int i = 0; i < l; i++)
        {
        	st = new StringTokenizer(br.readLine());
        	irregular.put(st.nextToken(), st.nextToken());
        }
        
        Set<String> set = new LinkedHashSet<>();
        List<Character> vowel = new ArrayList<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        
        for (int i = 0; i < n; i++)
        {
        	
        	String word = br.readLine();
        	if (irregular.containsKey(word)) set.add(irregular.get(word));
        	else 
        	{
        		
        		boolean flag = vowel.contains(word.charAt(word.length() - 2));
        		if (!flag && (word.endsWith("y"))) 
        		{
        			word = word.substring(0, word.length() - 1) + "ies";
        		}
        		else if (word.endsWith("o") || word.endsWith("s") || word.endsWith("ch") || word.endsWith("sh") || word.endsWith("x"))
        		{
        			word = word + "es";
        		}
        		else word = word + "s";
        		
        		set.add(word);
        	}
        	
        }
    	
        for (String word : set)
        {
        	bw.write(word + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }


}
