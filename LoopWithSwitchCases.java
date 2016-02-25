

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Axel
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 0, b = 0, c = 0, d = 0, e = 0;
        for (int i = 1; i <= 5; i++) {

            switch (i) {
                case 1:
                    String str = JOptionPane.showInputDialog("Math score ");
                    a = Double.parseDouble(str);
                    break;
                case 2:
                    String str1 = JOptionPane.showInputDialog("History score ");
                    b = Double.parseDouble(str1);
                    break;
                case 3:
                    String str2 = JOptionPane.showInputDialog("English score ");
                    c = Double.parseDouble(str2);
                    break;
                case 4:
                    String str3 = JOptionPane.showInputDialog("Biology score ");
                    d = Double.parseDouble(str3);
                    break;
                case 5:
                    String str4 = JOptionPane.showInputDialog("Physics score ");
                    e = Double.parseDouble(str4);
                    break;
                default:
                    break;
            }

        }
        
        boolean grad =evaluate(a,b,c,d,e);
        System.out.println(grad);
       

    }

    public static Boolean evaluate(double a, double b, double c, double d, double e) {

        boolean grad;
        double min;
        if ((averageGrade(a, b, c, d, e) >= 85) && (minGrade(a, b, c, d, e) >= 75)) {
            min = minGrade(a, b, c, d, e);
            if ((min + 20) > maxGrade(a, b, c, d, e)) {
                grad = true;
            } else {
                grad = isLucky();
            }
        } else {
            grad = false;
        }
        return grad;
    }

    public static double averageGrade(double a, double b, double c, double d, double e) {

        double av;

        av = (a + b + c + d + e) / 5;

        return av;

    }

    public static double minGrade(double a, double b, double c, double d, double e) {

        double min;
        if ((a < b && a < c && a < d && a < e)) {
            min = a;
        } else if ((b < a && b < c && b < d && b < e)) {
            min = b;
        } else if ((c < a && c < b && c < d && c < e)) {
            min = c;
        } else if ((d < a && d < c && d < b && d < e)) {
            min = d;
        } else {
            min = e;
        }
        return min;
    }

    public static double maxGrade(double a, double b, double c, double d, double e) {

        double max;
        if ((a > b && a > c && a > d && a > e)) {
            max = a;
        } else if ((b > a && b > c && b > d && b > e)) {
            max = b;
        } else if ((c > a && c > b && c > d && c > e)) {
            max = c;
        } else if ((d > a && d > c && d > b && d > e)) {
            max = d;
        } else {
            max = e;
        }
        return max;
    }

    public static boolean isLucky() {
       Boolean grad = false;

        Random rr = new Random();
        int dd;
        // 5 times
        for (int h=1; h<=5 ; h++){
            dd=rr.nextInt(6) + 1;
        
            if (dd==6) {
            grad =true;
            return grad;
            }else{
            grad = false;
            
            }
          }
        return grad;
          
    }
        

    

}
