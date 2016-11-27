/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula02;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Jonathan-David
 */
public class MeuFileUtils {
    public String VerificarAcao(String acao){
        String[] caminhoArquivo = acao.split("\\s+");
        return caminhoArquivo[0];
    }
    
    public boolean DeletarArquivo(String arquivo){
        arquivo = FormatarCaminhoArquivo(arquivo);
        boolean resposta = new File(arquivo).delete();
        return resposta;
    }
    
    public String MostrarCaminhoAbsoluto(String caminho){
        caminho = FormatarCaminhoArquivo(caminho);
        String caminhoAbsoluto = new File(caminho).getAbsolutePath();
        return caminhoAbsoluto;
    }
    
    public void RenomearArquivo(String arquivo){
        String[] novoNome = arquivo.split("\\s+");
        new File(MostrarCaminhoAbsoluto(arquivo)).renameTo(new File(novoNome[2]));
    }
    
    public void ArquivosEmPasta(String pasta){
        String path = MostrarCaminhoAbsoluto(pasta);
        File[] arquivos = new File(path).listFiles();
        if(arquivos != null){
            for (File arquivo : arquivos) {
            System.out.println(arquivo.getName());
            }
        }else{
            System.out.println("Não há nenhum arquivo nesta pasta");
        }
        
    }
    
    public boolean CriarArquivo(String arquivo){
        boolean resposta = false;
        arquivo = FormatarCaminhoArquivo(arquivo);
        try{
            resposta = new File(arquivo).createNewFile();
        }catch(IOException ex){
            
        }
        return resposta;
    }
    
    private String FormatarCaminhoArquivo(String arquivo){
        String[] caminhoArquivo = arquivo.split("\\s+");
        if(caminhoArquivo.length<2) return null;
        return caminhoArquivo[1];
    }
    
    public boolean CriarDiretorio(String diretorio){
        String caminhoDir = FormatarCaminhoArquivo(diretorio);
        File file = new File(caminhoDir);
        boolean CriouDiretorio =  file.mkdir();
        return CriouDiretorio;
    }
}
