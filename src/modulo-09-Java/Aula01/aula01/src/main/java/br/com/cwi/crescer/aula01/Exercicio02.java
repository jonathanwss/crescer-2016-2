/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio02 {
    public static void main(String ars[]){
        String data = "24/11/2015";
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        try{
            long diasPassou = TempoDecorridoEmDias(data);
            String dataFinal = TempoDecorridoEmFormatoData(diasPassou);
            System.out.println(dataFinal);
        }catch(ParseException e){
            System.out.println(e);
        }
    }
    
    public static long TempoDecorridoEmDias(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        Calendar calendarInserido = Calendar.getInstance();
        calendarInserido.setTime(formato.parse(data));
        
        Duration duration = Duration.between(calendarInserido.getTime().toInstant(), calendar.getTime().toInstant());
        return duration.toDays();
    }
    
    public static String TempoDecorridoEmFormatoData(long dias) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        boolean naoSair  = true;
        int ano =0, mes = 0, dia = 0;
        while(naoSair){
            if(dias>=365){
                ano++;
                dias -= 365;
            }else if(dias<365 && dias>=30){
                mes++;
                dias -= 30;
            }else{
                dia += dias;
                naoSair = false;
            }
        }
        return (dias+" dia(s) "+mes+" mes(es) "+ano+" ano(s)");
    } 
}
