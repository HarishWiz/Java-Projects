import java.util.Scanner;

public class ControlFlow {

	static void OddOrEven() {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=obj.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even Number");
		}
		else {
			System.out.println(num+" is Odd Number");
		}
		}
	
	static void LargestThreeNumbers() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the First Value:");
		int a=obj.nextInt();
		System.out.println("Enter the Second Value:");
		int b=obj.nextInt();
		System.out.println("Enter the Third Value:");
		int c=obj.nextInt();
		
		if(a>b&&a>c) {
			System.out.println(a+" is Biggest Number");
		}
		else if(b>a&&b>c) {
			System.out.println(b+" is Biggest Number");
		}
		else if(c>a&&c>b) {
			System.out.println(c+ " is Biggest Number");
		}
		
	}
	
	static void Calculator(){
		Scanner obj= new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int result;
		System.out.println("Enter an Operator: +, -, *, /, % ");
		char ch=obj.next().charAt(0);
		switch (ch) {
		case '+':
		    result=a+b;
			System.out.println(a+"+"+b+"="+result);
			break;
			
		case '-':
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
			break;
			
		case '*':
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
			break;
			
		case '/':
			result=a/b;
			System.out.println(a+"/"+b+"="+result);
			break;
			
		case '%':
			result=a%b;
			System.out.println(a+"%"+b+"="+result);
			break;

		default:
			System.out.println("Invalid Symbol");
			break;
		}
	}
	
	static void GradeSystem() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Student name:");
		String name=obj.nextLine();
		System.out.println("Enter Tamil Mark:");
		int tamil= obj.nextInt();
		System.out.println("Enter English Mark:");
		int english=obj.nextInt();
		System.out.println("Enter Maths Mark:");
		int maths=obj.nextInt();
		System.out.println("Enter Science Mark:");
		int science=obj.nextInt();
		System.out.println("Enter Social Mark:");
		int social=obj.nextInt();
		int total=tamil+english+maths+science+social;
		System.out.println("Name:"+name);
		System.out.println("Total:"+total);
		int average=total/5;
		System.out.println("Average:"+average+"%");
		
		if(tamil>=35 && english>=35 && maths>=35 && science>=35 && social>=35)
	    {
	        System.out.println("Result:Pass");
	    }
	    else{
	    	System.out.println("Result:Fail");
	    }
	    
	    
	    if(average>=90)
	    {
	    	System.out.println("Grade:Distinction");
	    }
	    else if(average>=80)
	    {
	    	System.out.println("Grade:First Class");
	    }
	    else if(average>=70)
	    {
	    	System.out.println("Grade:Second Class");
	    }
	    else if(average>=60)
	    {
	    	System.out.println("Grade:Third Class");
	    }
	    else if(average>=50)
	    {
	    	System.out.println("Grade:Average");
	    }
	    else if(average>=35){
	    	System.out.println("Grade:Below Average");
	    }
	    else{
	    	System.out.println("Grade:-");
	    }
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd or Even Program:");
		OddOrEven();
		System.out.println("Largest Three Number Program:");
		LargestThreeNumbers();
		System.out.println("Simple Calculator Program:");
		Calculator();
		System.out.println("Grading System Program:");
		GradeSystem();

	}

}
