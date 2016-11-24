/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

/**
 *
 * @author santos.jonathan
 */
public class Exercicio01 {
    public static void main(String args[]){
        System.out.println(VerificarSeEhpalindromo("ovo"));
    }
    
    public static boolean ValidarStringVazia(String frase){
        return frase.isEmpty();
    }
    
    public static int ContarNumeroDeVogais(String frase){
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
    
    public static StringBuilder InverterString(String frase){
        return new StringBuilder(frase).reverse();
    }
    
    public static boolean VerificarSeEhpalindromo(String frase){
        StringBuilder string = new StringBuilder(frase);
        StringBuilder igual = InverterString(frase);
        return igual == string;
    }
}
