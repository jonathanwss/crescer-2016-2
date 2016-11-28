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
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MeuFileUtils arquivo = new MeuFileUtils();
        String op = "";
        do{
        System.out.println("digite um acão: ");
        String path = input.nextLine();
        op = arquivo.VerificarAcao(path);
        switch(op){
            case "mk" :
                boolean contem = path.contains(".");
                boolean resultado = false;
                if(contem){
                    resultado = arquivo.CriarArquivo(path);
                }else{
                    resultado = arquivo.CriarDiretorio(path);
                }
                System.out.println(resultado);
            break;
            case "rm" :
                contem = path.contains(".");
                
                if(contem){
                    resultado = arquivo.DeletarArquivo(path);
                    System.out.println(resultado);
                }else{
                    System.out.println("Arquivo ou caminho inválido");
                }
            break;
            case "ls" :
                contem = path.contains(".");
                
                if(contem){
                    System.out.println(arquivo.MostrarCaminhoAbsoluto(path));
                }else{
                    arquivo.ArquivosEmPasta(path);
                }
            break;
            case "mv" :
                contem = path.contains(".");
                
                if(contem){
                    arquivo.RenomearArquivo(path);
                }else{
                    System.out.println("Arquivo ou caminho inválido");
                }
            break;
            case "sair" :
                System.out.println("Saindo...");
            break;
            default:
                System.out.println("Digite um comando válido");        
        }
        }while(!op.equalsIgnoreCase("sair"));
    }
}
