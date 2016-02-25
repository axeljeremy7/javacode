/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labbwer;

import java.util.Arrays;
import javax.swing.JOptionPane;
// Name: Axel Jeremy Solano Illesca
// Lab number:lab4
// Day:Sunday 18 at 11.59pm
//Course:CS 1110 lab on mondays at 12:30pm
//Porfessor :Vinay Gavirangaswamy

/**
 *
 * @author CAE-User
 */
public class Labbwer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //int a[], b[];
        //int add[], mult = 0;
        //a = new int[3];
        //b = new int[3];
        //add = new int[3];
        //for (int count = 0; count < 3; count++) {
           // add[count] = a[count] + b[count];
        // mult += a[count] * b[count];
       // }
//
        // for (int count = 0; count < 3; count++) {
        //   System.out.println("a[" + count + "]= " + add[count] + "");
       // }
        boolean conti = true;

        //String inputVal3 = JOptionPane.showInputDialog("Put the message");
        String input = JOptionPane.showInputDialog(" Type 1 to decrypt a message \n "
                + "Type 2 to encrypt a message");
        char inicial = input.charAt(0);
        if (inicial == '2') {
            String input2 = JOptionPane.showInputDialog("Type 1 for an entire message " + ""
                    + "reversal decryption \n"
                    + "Type 2 for a Pig-Latin decryption \n"
                    + "Type 3 for a simple Caesar style decryption");

            char inicial2 = input2.charAt(0);
            if (inicial2 == '3') {
                String input3 = JOptionPane.showInputDialog("Enter a number");
                int num34 = Integer.parseInt(input3);
                String sentence = JOptionPane.showInputDialog("Put the message");
                String sentence34 = sentence.toLowerCase();
                int size34 = sentence34.length();
                char[] letras34 = new char[size34];
                for (int i = 0; i < size34; i++) {
                    letras34[i] = sentence34.charAt(i);

                }
                System.out.print(simpleEncrypt(letras34, num34));

                //
                System.out.println();
            } else if (inicial2 == '2') {
                String sentence = JOptionPane.showInputDialog("Put the message");
                sentence = sentence.toLowerCase();
                System.out.print(pigLatinEncrypt(sentence));
                System.out.println();
            } else if (inicial2 == '1') {
                String sentence = JOptionPane.showInputDialog("Put the message");
                sentence = sentence.toLowerCase();
                int size = sentence.length();
                char[] letras = new char[size];
                for (int i = 0; i < size; i++) {
                    letras[i] = sentence.charAt(i);

                }
                System.out.print(reverseEncryptandDecrypt(letras));
                System.out.println();
            }

        } else if (inicial == '1') {
            String input2 = JOptionPane.showInputDialog("Type 1 for an entire message " + ""
                    + "reversal decryption \n"
                    + "Type 2 for a Pig-Latin decryption \n"
                    + "Type 3 for a simple Caesar style decryption");
            char inicial2 = input2.charAt(0);
            if (inicial2 == '3') {
                String input4 = JOptionPane.showInputDialog("Enter a number");
                int num38 = Integer.parseInt(input4);
                String sentence = JOptionPane.showInputDialog("Put the message");
                String sentence38 = sentence.toLowerCase();
                int size38 = sentence38.length();
                char[] letras38 = new char[size38];
                for (int i = 0; i < size38; i++) {
                    letras38[i] = sentence38.charAt(i);

                }
                System.out.print(simpleDecrypt(letras38, num38));

                System.out.println();
            } else if (inicial2 == '1') {
                String sentence = JOptionPane.showInputDialog("Put the message");
                sentence = sentence.toLowerCase();
                int size = sentence.length();
                char[] letras = new char[size];
                for (int i = 0; i < size; i++) {
                    letras[i] = sentence.charAt(i);

                }
                System.out.print(reverseEncryptandDecrypt(letras));
                System.out.println();
            } else if (inicial2 == '2') {
                String sentence = JOptionPane.showInputDialog("Put the message");
                System.out.print(pigLatinDecrypt(sentence));
                System.out.println();
            }

        }

        while (conti) {
            String input7 = JOptionPane.showInputDialog("Type 1 to continue with the program \n "
                    + "Type 2 to quit the program");
            char inicial7 = input7.toLowerCase().charAt(0);
            if (inicial7 == '1') {

                String input10 = JOptionPane.showInputDialog("Type 1 to decrypt a message "
                        + " or type 2 to encrypt a message");
                char inicial10 = input10.charAt(0);
                if (inicial10 == '2') {
                    String input2 = JOptionPane.showInputDialog("Type 1 for an entire message " + ""
                            + "reversal decryption \n"
                            + "Type 2 for a Pig-Latin decryption \n"
                            + "Type 3 for a simple Caesar style decryption");

                    char inicial2 = input2.charAt(0);
                    if (inicial2 == '3') {
                        String input39 = JOptionPane.showInputDialog("Enter a number");
                        int num349 = Integer.parseInt(input39);
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        String sentence349 = sentence.toLowerCase();
                        int size349 = sentence349.length();
                        char[] letras349 = new char[size349];
                        for (int i = 0; i < size349; i++) {
                            letras349[i] = sentence349.charAt(i);

                        }
                        System.out.print(simpleEncrypt(letras349, num349));
                        //
                        System.out.println();
                    } else if (inicial2 == '2') {
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        sentence = sentence.toLowerCase();
                        System.out.print(pigLatinEncrypt(sentence));
                        System.out.println();
                    } else if (inicial2 == '1') {
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        sentence = sentence.toLowerCase();
                        int size = sentence.length();
                        char[] letras = new char[size];
                        for (int i = 0; i < size; i++) {
                            letras[i] = sentence.charAt(i);

                        }
                        System.out.print(reverseEncryptandDecrypt(letras));
                        System.out.println();
                    }

                } else if (inicial10 == '1') {
                    String input2 = JOptionPane.showInputDialog("Type 1 for an entire message " + ""
                            + "reversal decryption \n"
                            + "Type 2 for a Pig-Latin decryption \n"
                            + "Type 3 for a simple Caesar style decryption");
                    char inicial2 = input2.charAt(0);
                    if (inicial2 == '3') {
                        String input49 = JOptionPane.showInputDialog("Enter a number");
                        int num389 = Integer.parseInt(input49);
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        String sentence389 = sentence.toLowerCase();
                        int size389 = sentence389.length();
                        char[] letras389 = new char[size389];
                        for (int i = 0; i < size389; i++) {
                            letras389[i] = sentence389.charAt(i);

                        }
                        System.out.print(simpleDecrypt(letras389, num389));

                        System.out.println();
                    } else if (inicial2 == '1') {
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        sentence = sentence.toLowerCase();
                        int size = sentence.length();
                        char[] letras = new char[size];
                        for (int i = 0; i < size; i++) {
                            letras[i] = sentence.charAt(i);

                        }
                        System.out.print(reverseEncryptandDecrypt(letras));
                        System.out.println();
                    } else if (inicial2 == '2') {
                        String sentence = JOptionPane.showInputDialog("Put the message");
                        sentence = sentence.toLowerCase();
                        System.out.print(pigLatinDecrypt(sentence));
                        System.out.println();
                    }

                }

            } else if (inicial7 == '2') {
                System.exit(0);
            }

        }

        //String sentence = JOptionPane.showInputDialog("Put the message");
        //isVowel(inputVal3);
        // uni(inputVal3);
        //System.out.print(Arrays.toString(der(letras))); con llaves
        //System.out.print((reverseEncryptandDecrypt(letras)));
        //System.out.println(toPigLatin(sentence));
        // System.out.println(pigLatinDecrypt(sentence));
    }

    public static char[] simpleEncrypt(char[] letras34, int num34) {
        char[] letras35 = new char[letras34.length];
        for (int i = 0; i < letras34.length; i++) {
            letras35[i] = (char) ((int) letras34[i] + num34);

        }
        //char tw[] = {'T', 'h', 'i', 's'};
        //System.out.println(tw[0]);
        //tw[0] = (char) ((int) tw[0] + 9);
        // System.out.println(tw[0]);

        return letras35;

    }

    public static char[] simpleDecrypt(char[] letras38, int num38) {
        char[] letras39 = new char[letras38.length];
        for (int i = 0; i < letras38.length; i++) {
            letras39[i] = (char) ((int) letras38[i] - num38);

        }
        //char tw[] = {'T', 'h', 'i', 's'};
        //System.out.println(tw[0]);
        //tw[0] = (char) ((int) tw[0] + 9);
        // System.out.println(tw[0]);

        return letras39;

    }

    public static char[] reverseEncryptandDecrypt(char[] letras) {
        //
        char[] letras2 = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letras2[i] = letras[letras.length - i - 1];
            //System.out.print(letras2[i]);
        }

        return letras2;

    }
    // this pin function is never used

    public static void pin(String inputVal3) {

        String[] words = inputVal3.split(" ");// split each word

        String reverseString = "";

        for (String word : words) {//int i = 0; i < words.length; i++
            //String word = words[i];
            String reverseWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
                //System.out.println(reverseWord);
                //each space in the sentence is like a println
                // each word as in its position is reverse thanks to the arrays
            }

            reverseString = reverseString + reverseWord + " ";
            //System.out.println();
            //System.out.println(reverseString);
        }

        //System.out.println(inputVal3);
        System.out.println(reverseString);

    }

    public static void uni(String inputVal3) {

        String[] words = inputVal3.split(" ");// split each word
        String[] reWord = {"aw"};
        //String reWord = "aqw";
        //if (isVowel(inputVal3) == true){
        for (int i = 0; i < words.length; i++) {
            reWord[i] = "aqy" + words[i];
        }

        //}
        System.out.println(Arrays.toString(reWord));
    }
//sentence.length() + words.length * "ay".length()

    private static String pigLatinEncrypt(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder latin = new StringBuilder(" ");
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                latin.append(' ');
            }
            String word = words[i];
            if (!word.isEmpty()) {
                char initial = word.charAt(0);
                if (Character.isDigit(initial) == false) {
// is enough to evaluate the firt initial number to maintain unchanged the message
                    isVowel(initial);
                    if (isVowel(initial) == true) {

                        latin.append(word).append("yay");
                    } else {
                        String remainin = word.substring(1);
                        //System.out.println(remainin);
                        latin.append(remainin).append(initial).append("ay");
                    }
                } else {
                    latin.append(word);
                }
            }
        }
        return latin.toString();
    }

    public static boolean isVowel(char at) {
        boolean isVow;
        isVow = (at == 'a' || at == 'e'
                || at == 'i'
                || at == 'o'
                || at == 'u'
                || at == 'y'); //reWord = reWord + word + " ";
        return isVow;

    }
//sentence.length() + words.length

    public static String pigLatinDecrypt(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder latin = new StringBuilder(" ");
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                latin.append(' ');
            }
            String word = words[i];
            if (!word.isEmpty()) {
                char initial = word.charAt(0);
                if (Character.isDigit(initial) == false) {
// is enough to evaluate the firt initial number to maintain unchanged the message

                    char last1 = word.charAt(word.length() - 1);
                    char last2 = word.charAt(word.length() - 1 - 1);
                    char last3 = word.charAt(word.length() - 1 - 2);
                    if (last1 == 'y' && last3 == 'y') {
                        String last4 = word.substring(0, word.length() - 3);
                        latin.append(last4);
                    } else if (last1 == 'y' && last2 == 'a') {
                        String last7 = word.substring(0, word.length() - 3);
                        char last8 = word.charAt(word.length() - 3);

                        latin.append(last8).append(last7);
                    }
                } else {
                    latin.append(word);
                }
            }
        }
        return latin.toString();
    }

}
