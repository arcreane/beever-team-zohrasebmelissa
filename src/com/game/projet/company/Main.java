package com.game.projet.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;



public class Main {




    public static void main(String[] args) {
        //ArrayList<String> SauScore =new ArrayList<String>;

       /* Plateau plateau = new Plateau();

        plateau.getPlateau(5);
        int[] tableau =new int[2];
        tableau= plateau.positionMarmotte(3);

        System.out.println("la ligne "+tableau[0]+"  la colonne " +tableau[1]);*/

	// write your code here
         Menu menu =new Menu();
         Scanner scan = new Scanner(System.in);
         String choix ;





         do{
             menu.menuJeu(); // afficher le premier menu /*
             //si l'utilisateur doit choisire entre
             // Nouvelle partie ; Visioner le meilleur Score

             // Quitter */
             System.out.print("Entrer votre choix ici :");
             choix=scan.nextLine();


         }while ( !(choix.equals("n")) && ! (choix.equals("v")) && !(choix.equals("q"))  );



         switch (choix) {

             case "n": {

                 String NiveauDifficulte;

                   do{
                       menu.menuDifficulterJeu();
                       System.out.print("Entrer le niveau choisi ici: ");
                       NiveauDifficulte=scan.nextLine();

                    }while(!(NiveauDifficulte.equals("f"))&&!(NiveauDifficulte.equals("m"))&&!(NiveauDifficulte.equals("d")));
                        Timer timer = new Timer();

                    // lancer le jeux selon la difficulter choisi
                        if(NiveauDifficulte.equals("f")){


                           // timer.scheduleAtFixedRate(new TimerTask() {
                               // int compteur =0;


                                //public void run() {

                                  jeux(5);}




                         else if(NiveauDifficulte.equals("m")){


                                jeux(10);

                            }else{ // Tres dificile

                                jeux(15);

                               }
                        break;}

             case "v" :{
                    break;
             }

             case "q" :{
                 System.out.println("Vous Quitter les jeux");
                 System.exit(1);}
                 break;




         }





    }


    public static boolean jeux(int nombresLigne){

        // Nouveau Scanner pour recuperer la reponse de l'utilisateur
        /*j'utilise bufferReadReader pour ne pas que le programme continuer l'excution le temps l'utilisateur saisi
         sa réponse */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =new Scanner(reader);


        Plateau plateau=new Plateau();
        plateau.setLigne(nombresLigne);// recupération de la taille de mon plateau qui depend de la difficulter.
        plateau.getPlateau();// Affiche le plateau
        plateau.positionMarmotte();
        int ligneMarmote = plateau.positionLignes;
        int colonneMarmote = plateau.positionCollones;

        System.out.println("Position Ligne de la marmotte   "+ligneMarmote+" Position colonne de la marmotte  "+colonneMarmote);


        int repLigne=-1;
            int repColonne=-1;



            System.out.println("Entre la position de la marmotte ici");


            String recup = sc.nextLine();
            String[] ret = recup.split(" ");

            try {

                 repLigne = Integer.parseInt(ret[0]);// la reponse  utilisateur position ligne de la marmotte


                 repColonne = Integer.parseInt(ret[1]);// la reponse utilisateur position de la colonne de la marmotte
                System.out.println("Votre reponse est :" +repLigne+"  "+repColonne);

           } catch (NumberFormatException e) { System.out.println("Only integer, you stupid"); }


            if ((repLigne == ligneMarmote)&&(repColonne==colonneMarmote)){

                return true;

            }
            else{ return false;}








    }



}




