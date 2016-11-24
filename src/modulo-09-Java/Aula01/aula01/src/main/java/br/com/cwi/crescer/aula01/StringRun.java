/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import java.util.Scanner;

/**
 *
 * @author santos.jonathan
 */

public class StringRun {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.println("Digite uma frase");
         System.out.println(ChecarVogais(input.nextLine()));
         System.out.println(InverterStrings(input.nextLine()));
    }
     
     public static int ChecarVogais(String frase){
         int tamanho = frase.length();
         int numVogais = 0;
         for(int x = 0; x < tamanho;x++){
             if(frase.substring(x,x+1).contains("a")||
                     frase.substring(x,x+1).contains("e")||
                     frase.substring(x,x+1).contains("i")||
                     frase.substring(x,x+1).contains("o")||
                     frase.substring(x,x+1).contains("u")){
                 numVogais++;
             }
         }
         return numVogais;
     }
     
     public static StringBuilder InverterStrings(String frase){
         StringBuilder s = new StringBuilder(frase);
         return s.reverse();
        }
             
}
