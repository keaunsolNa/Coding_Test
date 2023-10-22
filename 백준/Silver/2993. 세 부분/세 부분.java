import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   String word = br.readLine();
       ArrayList<String> list = new ArrayList<>();

       for (int i = 0; i < word.length() - 2; i++) {
       
    	   for (int j = i + 1; j < word.length() - 1; j++) {
           
    		   for (int k = j + 1; k < word.length(); k++) {
               
    			   if (word.length() == word.substring(i, j).length() + word.substring(j, k).length() + word.substring(k).length()) {
    				   
                       String a = new StringBuilder(word.substring(i, j)).reverse().toString();
                       String b = new StringBuilder(word.substring(j, k)).reverse().toString();
                       String c = new StringBuilder(word.substring(k)).reverse().toString();
                       list.add(a + b + c);
                       
                   }
               }
           }
       }

       Collections.sort(list);
       System.out.println(list.get(0));
   }
}