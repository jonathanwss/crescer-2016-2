/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author Jonathan-David
 */
public class MeuWriterUtils {

    public void EscreverEmArquivo(String arquivo, List<String> lista) {
        try (Writer writer = new FileWriter(arquivo, true);
             BufferedWriter bufferedWriter = new BufferedWriter(writer);)
        {
            for(String linha : lista){
            bufferedWriter.newLine();
            bufferedWriter.append(linha);
            bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
