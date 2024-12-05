import java.util.Scanner;

public class MultiplicationTable {
	
	public static void Tables() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Tables:");
		int table =sc.nextInt();
		System.out.println("Enter the Table Limit: ");
		int limit =sc.nextInt();
		int tables;
		
		for(int i =1;i<=limit;i++) {
			tables=table*i;
			System.out.println(table+" * "+i+" = "+tables);
		}
	}
	public static void main(String args[]) {
		Tables();
	}

}
