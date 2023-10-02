package CharacterDecode;

import java.util.Scanner;

public class CharacterDecode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the character=");
		char ch = scan.next().charAt(0);
		
		//Create the object of class 
		MessageDecoder decoder = new MessageDecoder();
		
		//call the function of class decoderCharacter
		int num = decoder.decoderCharacter(ch);
		
		//Print the decoded message
		System.out.println("The character is="+ch);
		System.out.println("The number is="+num);
		
		
	}

}
