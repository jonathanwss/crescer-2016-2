/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio3 {
    public static void main(String[] args) {
        MeuWriterUtils escritor = new MeuWriterUtils();
        List<String> lista =  new ArrayList<String>();
        lista.add("a");
        lista.add("b");
        lista.add("c");
        String caminho = "D:\\CWI\\a.txt";
        if(caminho.contains(".txt")){
            escritor.EscreverEmArquivo(caminho, lista);
        }else{
            System.out.println("Arquivo ou caminho inválido");
        }
    }
}
