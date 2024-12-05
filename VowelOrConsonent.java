import java.util.Scanner;

public class VowelOrConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(ch+" is A Vowel");
		}
		else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println(ch+" is A Vowel");
		}
		else if(ch>='a'&&ch<='z') {
			System.out.println(ch+" is A Consonent");
		}
		else if(ch>='A'&&ch<='Z') {
			System.out.println(ch+" is A Consonent");
		}
		
	}

}
