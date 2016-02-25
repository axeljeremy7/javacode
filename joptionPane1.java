
package lab2;
import javax.swing.JOptionPane;
/**
 *
 * @author Axel
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char pkgType;
        double hours, amountDue1,amountDue2 ,amountDue3;
        double hoursOT = 0;
        String str, str2;

        str = JOptionPane.showInputDialog("Enter you plan letter (A, B or C): ");
        pkgType = str.toUpperCase().charAt(0);
        //pkgType = str.charAt(0);

        str2 = JOptionPane.showInputDialog("Enter you number of hours: ");
        hours = Double.parseDouble(str2);
        hours = Math.round(hours);

        if (pkgType == 'a' || pkgType == 'A') {
            if (hours > 10) {
                hoursOT = hours - 10;
            }
            amountDue1 = 10 + hoursOT * 2.5;
            amountDue2 = 20.5 + (hoursOT-10) * 2;
            amountDue3 = 35;
            JOptionPane.showMessageDialog(null, "Your usage charge is for "
                    + hours + ".");
            JOptionPane.showMessageDialog(null, "Your charge for Package A are "
                    + amountDue1 + ".");
            JOptionPane.showMessageDialog(null, "With package B you would have save "
                    + (amountDue1 -amountDue2) + ".");
            JOptionPane.showMessageDialog(null, "With package C you would have save "
                    + (amountDue1 - amountDue3) + ".");

        } else if (pkgType == 'b' || pkgType == 'B') {
            if (hours > 20) {
                hoursOT = hours - 20;
            }
            amountDue2 = 20.5 + hoursOT * 2;
            amountDue3 = 35;
            JOptionPane.showMessageDialog(null, "Your usage charge is for "
                    + hours + ".");
            JOptionPane.showMessageDialog(null, "Your charge for Package B are "
                    + amountDue2 + ".");
            JOptionPane.showMessageDialog(null, "With package C you would have save "
                    + (amountDue2 - amountDue3) + ".");

        } else if (pkgType == 'c' || pkgType == 'C') {

            amountDue3 = 35;
            JOptionPane.showMessageDialog(null, "Your charge for Package C are "
                    + amountDue3 + ".");

        } else {
            
            JOptionPane.showMessageDialog(null, "Your usage charge is for "
                    + hours + ".");
            JOptionPane.showMessageDialog(null, " You entered an invalid plan code " +
                    pkgType + ".");
        }
        System.exit(0);

    

    }
    
}
