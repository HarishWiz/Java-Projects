import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the First Number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number:");
		int num2 = sc.nextInt();
		System.out.println(" +, -, *, /, % , Exit Press ?");
		char ch = sc.next().charAt(0);
		int result;
		switch (ch) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + " -" + num2 + " = " + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		case '/':
			result = num1 - num2;
			System.out.println(num1 + " / " + num2 + " = " + result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println(num1 + " % " + num2 + " = " + result);
			break;
		default:
			System.out.println("Press Only Keys +, - ,* ,% ,?");
			break;
		case '?':
			System.out.println("Program Terminated...");
			System.exit(0);
			
		
		}
		
		}

	}

}
