package com.game.projet.company;


import jdk.swing.interop.LightweightContentWrapper;

import java.util.Random;
import java.util.Timer;

public class Plateau{

      public  int positionCollones;

      public int positionLignes;

      private int Ligne;

    public Plateau( ){ }


    public void setLigne(int Ligne){
        this.Ligne=Ligne;

    }
    public int getLigne(){
        return this.Ligne;
    }



   public void  positionMarmotte(){

        Random ran= new Random();
        this.positionLignes= ran.nextInt(Ligne);//
        this.positionCollones= ran.nextInt(Ligne);//

       //this.positionLignes= (int)(Math.random()*Ligne);
       //this.positionCollones= (int)(Math.random()*Ligne);


        }


// System.out.println("\ud83d\udc3b")

    void getPlateau( ) {


            //String singe ="\ud83d\udc3b";

        for (int i = 0; i < Ligne; i++) {


                    for (int j= 0; j < Ligne; j++) {

                                    if((positionLignes==(Ligne-i-1))&&(positionCollones==j)){
                                       System.out.print("p"); }

                                    else if(j==0){
                                        System.out.print((Ligne-i-1)+"-\t");
                                    } else if (i==Ligne-1){
                                        System.out.print(j+"\t");


                                    }
                                    else{
                                        System.out.print("\t\t");

                                    }

                                }


                            System.out.println("  ");
                       }



    }
    }






