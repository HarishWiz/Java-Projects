import java.util.Scanner;

public class Car {
	String brand;
	String model;
	int speed;
	
	public Car(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Brand Name:");
		brand=sc.next();
		System.out.println("Enter Model Name:");
		model=sc.next();
		System.out.println("Enter the Speed:");
		speed=sc.nextInt();
	}
	public void disply() {
		System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Speed: " + speed + " km/h");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj=new Car();
		obj.disply();
		
	}

}
