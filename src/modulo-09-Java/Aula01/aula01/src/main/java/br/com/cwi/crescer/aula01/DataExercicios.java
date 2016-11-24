/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author santos.jonathan
 */
public class DataExercicios {
    public static void main(String args[]) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat diaDaSemana = new SimpleDateFormat("EEEE");
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        
        Calendar calendar = Calendar.getInstance();
        Date data = formatoData.parse("16/09/1998");
        
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.getTime());
        System.out.println(diaDaSemana.format(data));
    }
}