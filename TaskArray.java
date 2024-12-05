import java.util.Arrays;
import java.util.Collections;

public class TaskArray {
	
	static void LargestElement() {
		int array[]= {20,3,4,5,6,7,8,9};
		System.out.println("The Given Array is:");
		for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+",");
		}
		int max=Arrays.stream(array).max().getAsInt();
		System.out.print("\nThe Largest Element in given Array is:"+max);
	}
	
	 static void ArrayReverse()
	    {
		 Integer [] arr = {10, 20, 30, 40, 50};
		 System.out.println("Given Array is: "+ Arrays.asList(arr));
	        Collections.reverse(Arrays.asList(arr));
	        System.out.println("Reversed Array is : "+Arrays.asList(arr));
	    }
	 
	 static void SortArray() {
		 
		 int number[]={2,3,6,7,0,4,5};
		 System.out.println("Before Sorting:");
		 for(int num:number) {
			 System.out.print(num+",");
		 }
		 System.out.println("\nAfter Sorting:");
		 Arrays.sort(number);
		 for (int numb : number) {
			 System.out.print(numb+",");
		}
		 
	 }
	
	static void MatrixArray() {
		  
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
		      
		int c[][]=new int[3][3];
		        
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=a[i][j]+b[i][j];  
		System.out.print(c[i][j]+" ");    
		}    
		System.out.println();//new line    
		}    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Largest Element Program:");
		LargestElement();
		System.out.println("\nArray Reverse Program:");
		ArrayReverse();
		System.out.println("Array Sorting Program:");
		SortArray();
		System.out.println("\nMatrix Array Program:");
		MatrixArray();

	}

}
