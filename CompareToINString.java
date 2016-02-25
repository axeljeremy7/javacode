/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareto;

/**
 *
 * @author Axel
 */
public class CompareTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
      String str1 = "A ";
	  String str2 = "B ";
      String str3 = "C ";

      int result = str1.compareTo( str2 );
      System.out.println(result);
	  
      result = str2.compareTo( str1 );
      System.out.println(result);
	 
      result = str3.compareTo( str1 );
      System.out.println(result);
     
   
    }
    
}
