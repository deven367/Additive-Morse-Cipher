package alphamorse;

import java.util.Scanner;
import java.util.Vector;

public class Alphamorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<String> v = new Vector();

		char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.',
				'?' };

		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
				"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--", ".-.-.-",
				"..--.." };

		System.out.println("Enter the message you wish to send: ");

		String s = sc.next();
		s = s.toLowerCase();
		System.out.println("Encryption");

		char[] chars = s.toCharArray();

		for (int i = 0; i < s.length(); i++)
			for (int index = 0; index < english.length; index++) {
				if ((chars[i]) == english[index]) {
					System.out.print(morse[(index + 4) % 26] + " ");
					v.add(morse[(index + 4) % 26]);
				}
			}
		System.out.println("\nDecryption");

		for (int i = 0; i < s.length(); i++)
			for (int index = 0; index < morse.length; index++) {
				if ((v.elementAt(i)) == morse[(index)]) {
					System.out.print(english[(index - 4) % 26] + " ");
				}
			}
	}

}
