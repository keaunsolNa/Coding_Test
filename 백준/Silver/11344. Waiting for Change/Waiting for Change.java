import java.io.*;
import java.util.*;

public class Main {

	private static class Person {
		
		String name;
		int money;
		
		public Person(String name, int money)
		{
			this.name = name;
			this.money = money;
		}
	}
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        
       
        while (tc --> 0)
        {
        	
        	br.readLine();
        	int n = Integer.parseInt(br.readLine());
            int max = 0;
            int haveMoney = 0;
            
            List<Person> lineA = new LinkedList<>();
            List<Person> lineB = new LinkedList<>();
            
            StringBuilder sb = new StringBuilder();
            
            while (n --> 0) {
            	
            	st = new StringTokenizer(br.readLine());
            	String name = st.nextToken();
            	int money = Integer.parseInt(st.nextToken());
            	
            	lineA.add(new Person(name, money));
            }
        	
            while (!lineA.isEmpty())
            {
            	
            	if (!lineB.isEmpty() && haveMoney > 0)
            	{
            		lineB.remove(0);
            		haveMoney--;
            	}
            	
            	else {
            		
            		Person per = lineA.get(0);
            		if (per.money == 15)
            		{
            			lineA.remove(0);
            			haveMoney++;
            		}
            		else if (per.money == 20 && haveMoney > 0)
            		{
            			lineA.remove(0);
            			haveMoney--;
            		}
            		else 
            		{
            			lineB.add(lineA.get(0));
            			lineA.remove(0);
            			
            			if (max < lineB.size())
            			{
            				
            				max = lineB.size();
            				sb.setLength(0);
            				Iterator<Person> iter = lineB.iterator();
            				
            				while (iter.hasNext())
            				{
            					sb.append(iter.next().name + " ");
            				}
            			}
            		}
            	}
            }
            
            if (max == 0) bw.write("Line B stayed empty.");
            else
            {
            	bw.write(sb.toString());
            }
            
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }


}
