import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] flat = new String[] {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
		
		while(true) {
			
			String input = br.readLine();
			if(input.equals("***")) break;
			
			String[] inputFlat = input.split(" ");
			int updown = Integer.parseInt(br.readLine());
			int index = 0;
			
			for(int i = 0; i < inputFlat.length; i++) {

				String s = inputFlat[i];
				switch(s) {				
				
					case "A" : index = 0; break;
					case "A#" :				
					case "Bb" : index = 1; break;				
					case "B" :				
					case "Cb" : index = 2; break;
					case "B#":				
					case "C" : index = 3; break;
					case "C#" :				
					case "Db" : index = 4; break;				
					case "D" : index = 5; break;
					case "D#":				
					case "Eb" : index = 6; break;
					case "E" :				
					case "Fb" : index = 7; break;
					case "E#" :				
					case "F" : index = 8; break;
					case "F#":				
					case "Gb" : index = 9; break;				
					case "G" : index = 10; break;
					case "G#":				
					case "Ab" : index = 11; break;				
				}
				
				if(index + updown < 0) index += 12;
				
				System.out.print(flat[(index + updown) % 12] + " ");			
			}
			System.out.println();
		}
   }
}