import java.util.Scanner;

public class BasicSyntaxPrinting {
		
		static void HelloWorld() {
			System.out.println("Hello, World");
		}
		
		
		static void  SimpleArithmetic() {
			Scanner obj =new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int a=obj.nextInt();
			int b=obj.nextInt();	
			System.out.print("Addition of:"+a+"+"+b+"=");
			System.out.println(a+b);
			System.out.print("Subtraction of:"+a+"-"+b+"=");
			System.out.println(a-b);
			System.out.print("Multiplication of:"+a+"*"+b+"=");
			System.out.println(a*b);
			System.out.print("Division of:"+a+"/"+b+"=");
			System.out.println(a/b);
			System.out.print("Modulo of:"+a+"%"+b+"=");
			System.out.println(a%b);
		}
		
		static void RectanglePerimeter() {
			
			 float length, width , area, perimeter;
		        Scanner in = new Scanner(System.in);
		        System.out.print("Enter length of rectangle: ");
		        length = in.nextFloat();
		        System.out.print("Enter width of rectangle: ");
		        width = in.nextFloat();
		        perimeter = 2 * (length + width);
		        area = length * width;		        
		        System.out.println("Perimeter of rectangle is " + perimeter + " units.");
		        System.out.println("Area of rectangle is " + area + " sq. units.");
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World Program:");
		HelloWorld();
		System.out.println("Simple Arithmetic Program:");
		SimpleArithmetic();
		
		System.out.println("Area of Perimeter Program:");
		RectanglePerimeter();

	}

}
