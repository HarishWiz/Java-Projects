import java.util.Scanner;

public class PowerFunction {
	
	static int power(int x, int n) {
		int y=0;
		if(n==0) 
		return 1;
		else if(n==1)
			return x;
		else {
			y= power(x, n/2);
			y=y*y;
			if(y%2==0) {
				return y;
			}
		}
		return x*y;
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Base:");
		int base=sc.nextInt();
		System.out.println("Enter the Power:");
		int power=sc.nextInt();
		System.out.println(base+"^"+power+"="+(power(base, power)));
	}

}
