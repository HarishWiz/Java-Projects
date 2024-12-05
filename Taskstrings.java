import java.util.Scanner;

public class Taskstrings {
	
	static void StringPalindrome() {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = obj.nextLine();
		String reversestring ="";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reversestring=ch+reversestring;
		}
		System.out.println(reversestring);
		if(str.equals(reversestring)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is Not Palindrome");
		}
	}
	
	static void CountVowelandConsonent() {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = obj.nextLine();
		int vowels = 0,consonants=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowels++;
			}
			else if(ch>='a'&&ch<='z') {
				consonants++;
			}
			else if (ch>='A'&&ch<='Z') {
				consonants++;
			}
		}
		System.out.println(str);
		System.out.println("Vowels Count:"+vowels);
		System.out.println("Consonants Count:"+consonants);
	}
	
	static void ReveseString() {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = obj.nextLine();
		String reversestring = "";
		char ch;
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reversestring=ch+reversestring;
		}
		System.out.println("Reversed String is:"+reversestring);
	}
	
	static void FrequencyofCharacter() {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the String:");
		 String text = obj.next();
	        int[] frequency = new int[256];

	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            frequency[ch]++;
	        }

	        for (int i = 0; i < frequency.length; i++) {
	            if (frequency[i] > 0) {
	                System.out.println("Character: " + (char) i + " - Frequency: " + frequency[i]);
	            }
	        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Palindrome checker Program:");
		StringPalindrome();
		System.out.println("Vowels and Consonants Count Program:");
		CountVowelandConsonent();
		System.out.println("Reversed String Program:");
		ReveseString();
		System.out.println("Frequency of Each Character Program:");
		FrequencyofCharacter();

	}

}
