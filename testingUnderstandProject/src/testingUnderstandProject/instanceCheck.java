package testingUnderstandProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class instanceCheck {
	public static void main(String []args) {
		int demo  = enersyProduced("idnsin fis$d");
		
		System.out.println(demo);
	}

	private static int enersyProduced(String textInput) {
		int answer = 0;
		for(char c : textInput.toCharArray())
		{
			if(!Character.isLetter(c) && c != ' ') {
				answer++;
			}
		}
		return answer;
	}
	
	
	
}
