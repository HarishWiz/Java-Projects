import java.util.Scanner;

public class TaskFunctions {
	
	static void PrimeNumber() {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=obj.nextInt();
		int count=0;

		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println(num+" is Prime Number");
			}
			else {
				System.out.println(num+" is Not a Prime Number");
			}
		}
		else {
			System.out.println(num+" is Not a Prime Number");
		}
	}
			
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber();


	}

}
