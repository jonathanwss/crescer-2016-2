/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Jonathan-David
 */
public class MeuReaderUtils {
    public void LeitorDeArquivos(String arquivo){
         try (   
             Reader reader = new FileReader(arquivo);
             BufferedReader bufferReader = new BufferedReader(reader);
            ){
                bufferReader.lines()
                     .forEach(System.out::println);
            }catch(IOException e){
                System.err.println("Arquivo não encontrado ou não existe");
            }
    }
}
