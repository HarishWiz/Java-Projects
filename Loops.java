import java.util.Scanner;

public class Loops {
	
	static void Tables() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Multiplication Table Number:");
		int num=obj.nextInt();
		System.out.println("Enter the Limit of the Table:");
		int limit=obj.nextInt();
		for(int i=1;i<=limit;i++) {
			 int result=i*num;
			 System.out.println(num+"*"+i+"="+result);
		}
	}
	

	static void NaturalNumbers() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Limit to Sum the Natural Number:");
		int num=obj.nextInt();
		int sum = 0;
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of first "+num+" is: "+sum);
	}
	
	static void ReverseNumber() {
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=obj.nextInt();
		int answer=0;
	
		while(num>0) {
			int lastdigit =num%10;  
			answer=answer*10+lastdigit;
			num=num/10;
		}
		System.out.println("Reversed Number is: "+answer);
	}
	
	static void Factorial() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=obj.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}
	
	static void Fibonacci() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int limit=obj.nextInt();
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2);
		for(int i=2;i<limit;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tables Program:");
		Tables();
		System.out.println("Natural Numbers Program:");
		NaturalNumbers();
		System.out.println("Reverse Number Program:");
		ReverseNumber();
		System.out.println("Factorial Program:");
		Factorial();
		System.out.println("Fibonacci Program:");
		Fibonacci();

	}

}
