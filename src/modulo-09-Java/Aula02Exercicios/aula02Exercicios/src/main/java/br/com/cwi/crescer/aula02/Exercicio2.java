/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.util.Scanner;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio2 {
    public static void main(String[] args) {
        MeuReaderUtils leitor = new MeuReaderUtils();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo a ser lido: ");
        String caminho = input.nextLine();
        if(caminho.contains(".txt")){
            leitor.LeitorDeArquivos(caminho);
        }else{
            System.out.println("arquivo ou caminho inválido");
        }
    }
}
