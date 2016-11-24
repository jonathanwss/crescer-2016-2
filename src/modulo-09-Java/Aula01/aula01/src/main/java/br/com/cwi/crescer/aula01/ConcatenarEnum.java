/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author santos.jonathan
 */
public class ConcatenarEnum {
    public static void main(String args[]){
        int enumQtd = Estados.class.getEnumConstants().length;
        System.out.println(IterarEnum(enumQtd));
    }
    
    public static StringBuffer IterarEnum(int vezes){
        StringBuffer string = new StringBuffer();
        for(int x=0; x< vezes;x++){
            if(x==vezes-1){
                string.append(Estados.values()[x].getNome());
            }else{
                string.append(Estados.values()[x].getNome()).append(",");
            }
        }
        return string;
    }
    
    public static ArrayList<String> PorResultadoEnumArray(StringBuffer string){
        int tamanho = string.length();
        ArrayList<String> arrayRetorno = new ArrayList<>();
        int posicaoInicial = 0;
        for(int x =0; x < tamanho; x++){
            if(string.substring(x, x+1).equals(",")){
                arrayRetorno.add(string.substring(posicaoInicial,x));
                posicaoInicial = x + 1;
            }
            
        }
        return arrayRetorno;
    }
}

