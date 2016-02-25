
/**
 *
 * @author Axel 
 *
 */
public class TestClassRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Code uno = new Code();
		
		uno.printUno(5);
		System.out.println();
		uno.printDos(5);
		System.out.println();
		System.out.print(uno.power(3, 2));
		System.out.println();
		uno.writeVertical(1234);

	}
	
	
	

}



// other class

package edu.wmich.cs1120.spring16.labEx3Recur;

public class Code {

	public  void printUno(int n){

		if(n<=0){
			System.out.print(0);
		}
		else{
			
			System.out.print(n + " ");
			printUno(n-1);	
		}

	}
	
	public void printDos(int n){
		if(n<=0){
			System.out.print(0 +  " ");
		}
		else{
			printDos(n-1);
			System.out.print(n + " ");
				
		}

		
	}
	
	public int power(int x, int n){
		if(n==0){
			return 1;
		}
		else{
			return power(x,n-1)*x;
			
		}
		
		
		
	}
	
	
	public void writeVertical(int n){
		if(n<10){
			
			System.out.println(1);
		}else{
			
			writeVertical(n/10);
			System.out.println(n%10);
		}
		
	}
}
