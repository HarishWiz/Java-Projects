import java.util.Scanner;

public class DividebyZero {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Numerator:");
        int n = sc.nextInt();
        System.out.println("Enter Denominator:");
        int d = sc.nextInt(); 

        try {
            int result = n / d;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
        	System.out.println("Number Can not Divide by Zero..."+e);
        }
        System.out.println("After the Program:");

        for(int i=0;i<5;i++) {
        	for(int j=i;j<5;j++) {
        	System.out.print("* ");
        }
        	System.out.println();
        }
    }
}
