package com.company;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Scores {
    public static void main(String[] args) {
    //Array.toString();
    //int [] tabScores = new int [5];
    //System.out.println (tabScores[0][1][2][3][4]);

        // TABLEAU DE SCORES :
        /*
        int [] meilleurScore = {10, 9, 8, 7, 6};
        System.out.println(meilleurScore[0]);
        */

        /* int [] score = new int [5];
        System.out.println(score[0]);
        */


        // TABLEAU DE NOMS :
        Scanner scan = new Scanner(System.in);

        String [] names = new String[5];
        for(int i = 0; i <names.length; i++) {
            System.out.println(names);
            names[i]=scan.nextLine();
        }

        // TABLEAUX IMBRIQUES :
        // int [][] meilleurScore = new int [5][2];

        /*
        String [] tabNoms = new String[] { "foo", "bar", "baz" };
        for(String tt :tabNoms){
        System.out.println(tt);
        */

        // TRIER LE TABLEAU (SCORES LES PLUS HAUTS) :
        //La classe Arrays : 2 méthodes  pour trier les tableaux
        // méthode sort ([]) et 

 }
}

