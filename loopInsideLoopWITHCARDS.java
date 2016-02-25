/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinationarrayincards;

/**
 *
 * @author Axel
 */
public class CombinationArrayInCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};

        System.out.println(rank[(int) (Math.random() * rank.length)] + " of "
                + suit[(int) (Math.random() * suit.length)]);
        System.out.println();
        int size = suit.length * rank.length;
        String[] deck = new String[size];
        
//For each element of the array of rank, print 4 elements of the array of suit
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }

 //System.out.println("index:"+(suit.length*i+j)+" "+rank[i]+" of "+suit[j]);
        for (int d = 0; d < size; d++) {
            System.out.println("index: "+d +" " +deck[d]);
        }

    }
    
    public void combi( int n, String  rank, String  suit){
      //  String [] deck = new String[suit.length * rank.length];
       // combi(n-1, rank[n-2], suit[n-1] );
    
    }

}
