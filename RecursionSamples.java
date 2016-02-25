
public class RecursionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExamples uno = new RecursionExamples();
	
	uno.getTriangularNumR(6);
		System.out.println();
		uno.getFactorialNum(7);
		//System.out.println();
		//towersOfHanoiUno(3,0,1,2);
		//System.out.println();
		//towersOfHanoiDos(3,0,1,2);
		System.out.println();
		//towersOfHanoiDeCinco(3,0,1,2);
		System.out.println();
	}

	public int getTriangularNumR(int number){
		
		System.out.println("Method " + number); 
		if(number == 1){ 
		System.out.println("Returned 1"); 
		return 1; 
		}else{
	    int result = number + getTriangularNumR(number - 1); 
		System.out.print("Return " + result); 
		System.out.println(" : " + number + " + getTriangularNumR(" + number + " - 1)");
		return result; 
		}
	}
	
	public int getFactorialNum(int n){
		System.out.println("Method " + n); 
		if(n == 1){ 
			System.out.println("Returned 1"); 
			return 1; 
			}else{
		    int result = n * getFactorialNum(n - 1); 
			System.out.print("Return " + result); 
			System.out.println(" : " + n + " * getFactorial(" + n + " - 1)");
			return result; 
			}
		
	}
	
	public static void towersOfHanoiUno(int disks, int from, int to, int spare) {
		
		System.out.println("Method " + disks);
        if (disks == 1) {
            // There is only one disk to be moved.  Just move it.
            System.out.printf("Move disk 1 from stack %d to stack %d%n", 
                                   from, to);
           
        }
        else {
                // Move all but one disk to the spare stack, then
                // move the bottom disk, then put all the other
                // disks on top of it.
        	//de 0 a 2 
        	// de from para spare
        	towersOfHanoiUno(disks-1, from, spare, to);
        	//disco 3 del from para to
        	// de 0 a 1
            System.out.printf("Move disk %d from stack %d to stack %d%n",
                                  disks, from, to);
            // de 2 a 1
            // de spare para to
            towersOfHanoiUno(disks-1, spare, to, from);
            
        }
    }
	
	public static void towersOfHanoiDos(int disks, int from, int spare, int to) {
		
		System.out.println("Method " + disks);
        if (disks == 1) {
            // There is only one disk to be moved.  Just move it.
            System.out.printf("Move disk 1 from stack %d to stack %d%n", 
                                   from, to);
           
        }
        else {
                // Move all but one disk to the spare stack, then
                // move the bottom disk, then put all the other
                // disks on top of it.
        	// de 0 a 1
        	// de from para spare 
        	towersOfHanoiDos(disks-1, from, to, spare);
        	// disco 3 del from para to
        	// de 0 a 2
            System.out.printf("Move disk %d from stack %d to stack %d%n",
                                  disks, from, to);
            // de 1 a 2
            // de spare para to 
            towersOfHanoiDos(disks-1, spare, from, to);
            
        }
    }
	
public static void towersOfHanoiDeCinco(int disks, int from, int spare, int to) {
		// this is not yet correct
		///System.out.println("Method " + disks);
        if (disks >0) {
           
         
          
        	towersOfHanoiDeCinco(disks-1, from, to, spare);
        	
            System.out.printf("Move disk %d from stack %d to stack %d%n",
                                  disks, from, to);
            towersOfHanoiDeCinco(disks-1,to,from,spare);
            System.out.printf("Move disk %d from stack %d to stack %d%n",
                    disks, from, to);
       
            towersOfHanoiDeCinco(disks-1, spare, from, to);
            
        }
    }
}
