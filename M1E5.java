package fr.dampierre;

import java.util.Random;
import java.util.Scanner;


public class M1E5 {
    

        public static void main(String[] args) throws Exception {
                Scanner clavier = new Scanner(System.in);
                Random randomNumbers = new Random();

                int random = randomNumbers.nextInt(100)+1;

                System.out.println("je pense à un nombre entre 1 et 100 inclus. Devines lequel");
                
                System.out.println("entrez un nombre ");                
                int nb =  clavier.nextInt();

                System.out.println("Vous proposez : " + nb);

                System.out.println("le nombre auquel je pense était : "+ random);

                int diff ;
                if ( random < nb){
                    diff = nb - random;
                }else {
                    diff = random- nb;
                }

                System.out.println("vous étiez à " + diff + " de la bonne réponses");
          }
}