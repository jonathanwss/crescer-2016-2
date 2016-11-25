/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio02 {
    public static void main(String ars[]){
        String data = "25/11/2015";
        SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
        try{
            long diasPassou = TempoDecorrido(data);
           
            System.out.println(diasPassou);
        }catch(ParseException e){
            System.out.println(e);
        }
    }
    
    public static long TempoDecorrido(String data) throws ParseException{
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        Calendar calendarInserido = Calendar.getInstance();
        calendarInserido.setTime(formato.parse(data));
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime oldDate = now.minusDays(1).minusMinutes(10);
        Duration duration = Duration.between(calendarInserido.getTime().toInstant(), calendar.getTime().toInstant());
         return duration.toDays();
    }
}
