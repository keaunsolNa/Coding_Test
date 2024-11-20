import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main { 

	public static void main(String[] args) throws IOException {
        
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = "";
		int idx = 1;
        
		while (!(str = bf.readLine()).equals("0")) 
        {
            
			boolean flag = false;
			for (int i = 0; i < str.length() - 1; i++) 
            {
				if (str.charAt(0) != '1' || str.charAt(str.length() - 1) != '2') 
                {
					flag = true;
					break;
				}
				if (str.charAt(i) == '1' || str.charAt(i) == '3') 
                {
					if (str.charAt(i + 1) == '4' || str.charAt(i + 1) == '5') 
                    {
						continue;
					} 
                    else 
                    {
						flag = true;
						break;
					}
				} 
                else if (str.charAt(i) == '2') 
                {
					flag = true;
					break;
				} 
                else if (str.charAt(i) == '4' || str.charAt(i) == '6') 
                {
					if (str.charAt(i + 1) == '2' || str.charAt(i + 1) == '3') 
                    {
						continue;
					} 
                    else 
                    {
						flag = true;
						break;
					}
				} 
                else if (str.charAt(i) == '5' || str.charAt(i) == '7') 
                {
					if (str.charAt(i + 1) == '8') 
                    {
						continue;
					} 
                    else 
                    {
						flag = true;
						break;
					}
				} 
                else if (str.charAt(i) == '8') 
                {
					if (str.charAt(i + 1) == '6' || str.charAt(i + 1) == '7') 
                    {
						continue;
					} 
                    else 
                    {
						flag = true;
						break;
					}
				}
			}
			if (str.length() == 1) 
            {
				flag = true;
			}
			if (flag) 
            {
				bw.write(idx + ". NOT\n");
			} 
            else 
            {
				bw.write(idx + ". VALID\n");
			}
			idx++;
		}
		bw.flush();
	}
}