import java.util.Scanner;

class BelowAgeException extends Exception{
	public BelowAgeException(String s) {
		super(s);
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new BelowAgeException("Your Age Should be Above 18 ");
			}
			else {
				System.out.println("You are Eligible to Apply");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
