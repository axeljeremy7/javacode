/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancetravelled;

import java.util.Scanner;

/**
 *
 * @author Axel
 */
public class DistanceTravelled {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
         int speed;
	int time;
		
		//int fi;
	Scanner ke = new Scanner(System.in);
	System.out.print("Enter a vehicle speed (in mph):");
	speed = ke.nextInt();
	Scanner ke2 = new Scanner(System.in);	
	System.out.print("Enter time travelled (in hrs):");
	time = ke2.nextInt();
		
		if( (speed>0)&& (time >=1)){
			
			for (int i =1; i <= time; i++){
			System.out.println(i  + "\t"+"\t" +(speed*i));
			}
		}
		
        
        
        
    }
    
}
