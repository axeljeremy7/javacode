

import javax.swing.JOptionPane;

/**
 *
 * @author Axel
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ans;
        //char ans2;
        //String ans1;
        String str;
        boolean continue1 = true;
        int stringSize;

        while (continue1) {
            str = JOptionPane.showInputDialog("Do you want to continue? ");
            stringSize = str.length();
            if (str == null) {
                System.exit(0);
            }

            if (stringSize < 2) {
                ans = str.toUpperCase().charAt(0);
                switch (ans) {
                    case 'Y':
                    case 'O':
                    case 'M':
                        continue1 = true;
                        //JOptionPane.showMessageDialog(null,"Thank you for your input");
                        System.out.print("Thank you for your input");
                        break;

                    case 'N':

                        continue1 = false;
                        break;

                    default:
                        // I CHANGE THE STAMENT HERE FOR THE CONVENIENCE OF THE USER
                         JOptionPane.showMessageDialog(null, "Error, you must enter " + "Yes" + "," + " Oui,"
                            + " Ouais" + " or " + "Mouais" + " to quit or " + "No" + ","
                            + " Non" + " to continue");
                    break;

                }
            } else 
            {
                str = str.toUpperCase();
                switch (str) {
                

                case "YES":
                case "OUI":
                case "MOUAIS":
                    continue1 = true;
                    //JOptionPane.showMessageDialog(null,"Thank you for your input");
                    System.out.print("Thank you for your input");

                    break;
                case "NO":
                case "NON":
                    continue1 = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, you must enter " + "Yes" + "," + " Oui,"
                            + " Ouais" + " or " + "Mouais" + " to quit or " + "No" + ","
                            + " Non" + " to continue");
                    break;

            }
            }

            

        }

    }

}
