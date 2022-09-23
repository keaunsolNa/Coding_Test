package baekjoon;

import java.util.Scanner;

public class Test06_String09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] charArr = sc.nextLine().toCharArray();

		int CroatiaAlphabet = 0;
		for(int i = 0; i < charArr.length; i++) {
			
			if(i != charArr.length - 1) {
				if(charArr[i] == 'c') {
					if(charArr[i+1] == '=' || charArr[i+1] == '-') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'd') {
					if(charArr[i+1] == '-') {
						CroatiaAlphabet++;
						i++;
						continue;
					} else if(charArr[i+1] == 'z') {
						if(i+2 != charArr.length) {
							if(charArr[i+2] == '=') {
								CroatiaAlphabet++;
								i++;
								i++;
								continue;
							}
						} 
					}
				} else if(charArr[i] == 'l') {
					if(charArr[i+1] == 'j') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'n') {
					if(charArr[i+1] == 'j') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 's') {
					if(charArr[i+1] == '=') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				} else if(charArr[i] == 'z') {
					if(charArr[i+1] == '=') {
						CroatiaAlphabet++;
						i++;
						continue;
					}
				}
			} 
			CroatiaAlphabet++;
		}
		
		System.out.println(CroatiaAlphabet);
		
	}
}
