/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jonathan-David
 */
public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PersonagemFactory personagem = new PersonagemFactory();
        String opcao = "";
        do{
        System.out.println("O que você deseja fazer");
        System.out.println("1- Importar arquivo sql");
        System.out.println("2- Executar query");
        System.out.println("3- Importar arquivo csv");
        System.out.println("4- Exportar arquivo csv");
        opcao = input.nextLine();
        acoes(opcao, personagem, input);
        }while(!opcao.equalsIgnoreCase("sair"));
    }
    
    public static void acoes(String opcao, PersonagemFactory personagem, Scanner input){
        switch(opcao){
            case "1":
                System.out.println("digite o caminho do arquivo sql");
                personagem.executarComandosViaArquivoSql(input.nextLine());
                System.out.println("........");
                break;
            case "2":
                System.out.println("Faça a query que deseja");
                personagem.buscarQuery(input.nextLine());
                break;
            case "3":
                System.out.println("Digite o caminho do arquivo que deseja importar");
                personagem.insertDoArquivoCsv(input.nextLine());
                break;
            case "4":
                WriterReaderArquivos escritor = new WriterReaderArquivos();
                System.out.println("Digite o caminho onde o arquivo será criado");
        
                try {
                    escritor.exportarArquivoCsv(input.nextLine());
                } catch (IOException ex) {
                    System.err.println("Ocorreu algum erro");
                }
        
                break;
            default:
                System.out.println("Saindo...");
                break;
        }
    }
}
