/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filelettercounter;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Axel
 */
public class Filelettercounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String nombre1;

        String letra;
        char letra1;
        Scanner key = new Scanner(System.in);
        System.out.print("Enter file name:");
        nombre1 = key.nextLine();

        File file = new File(nombre1);
        Scanner inputFile = new Scanner(file);

        System.out.println("Enter the character to count:");
        letra = key.nextLine();
        letra1 = letra.charAt(0);

        int c = 0;
        while (inputFile.hasNext()) {

            String nombre2 = inputFile.nextLine();

            for (int i = 0; i < nombre2.length(); i++) {
                if (nombre2.charAt(i) == letra1) {
                    c = c + 1;
                }
            }
        }

        System.out.println("The character" + letra1 + " appears in the file"
                + nombre1 + " " + c + "times.");
    }

}
