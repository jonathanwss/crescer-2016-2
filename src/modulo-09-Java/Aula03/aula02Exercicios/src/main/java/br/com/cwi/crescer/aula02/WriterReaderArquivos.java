package br.com.cwi.crescer.aula02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class WriterReaderArquivos {
    public List<String> lerArquivo(String arquivo) {
        List<String> comando = new ArrayList<>();
        try (Reader reader = new FileReader(arquivo);
                BufferedReader bufferReader = new BufferedReader(reader);) {
            bufferReader.lines()
                    .forEach(line -> comando.add(line));
        } catch (IOException e) {
            System.err.println("Arquivo não encontrado ou não existe");
        }
        return comando;
    }
    
    public List<Personagem> lerArquivoCsv(String arquivo) {
        List<String> linhas = lerArquivo(arquivo);
        List<Personagem> personagens = new ArrayList<>();
        linhas.forEach(line -> {
            String[] persona = line.split(";");
            Personagem p = new Personagem();
            p.setIdPersonagem(Integer.parseInt(persona[0]));
            p.setNmPersonagem(persona[1]);
            personagens.add(p);
        });
        return personagens;
    }
    
    public void exportarArquivoCsv(String caminhoArquivo) throws IOException {
        PersonagemFactory personagem = new PersonagemFactory();
        new File(caminhoArquivo).createNewFile();
        List<Personagem> personagens = personagem.buscarTodos();
        try (final Writer writer = new FileWriter(caminhoArquivo, true);
             final BufferedWriter bufferedWriter = new BufferedWriter(writer);
         )
         {
             for(Personagem persona : personagens){
                 bufferedWriter.append(persona.getIdPersonagem()+";"+persona.getNmPersonagem()+";"); 
                 bufferedWriter.newLine();
                 bufferedWriter.flush();
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
