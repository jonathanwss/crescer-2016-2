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
        System.out.println("Recursos disponiveis nesta classe");
        System.out.println("1-Verificar string vazia");
        System.out.println("2-Verificar número de vogais");
        System.out.println("3-Innverter palavra");
        System.out.println("Verificar se palavra é palindromo");
    }
    
    public static boolean ValidarStringVazia(String frase){
        return frase.isEmpty();
    }
    
    public static int ContarNumeroDeVogais(String frase){
        int tamanho = frase.length();
        String fraseLower = frase.toLowerCase();
         int numVogais = 0;
         for(int x = 0; x < tamanho;x++){
             if(fraseLower.substring(x,x+1).contains("a")||
                     fraseLower.substring(x,x+1).contains("e")||
                     fraseLower.substring(x,x+1).contains("i")||
                     fraseLower.substring(x,x+1).contains("o")||
                     fraseLower.substring(x,x+1).contains("u")){
                 numVogais++;
             }
         }
         return numVogais;
    }
    
    public static StringBuilder InverterString(String frase){
        return new StringBuilder(frase).reverse();
    }
    
    public static boolean VerificarSeEhpalindromo(String frase){
        String fraseUpper = frase.toUpperCase();
        String fraseInvertida = (String)InverterString(fraseUpper).toString();
        return fraseInvertida.equals(fraseUpper);
    }
}
