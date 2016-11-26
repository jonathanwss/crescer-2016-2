/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import static java.lang.Math.ceil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Parcelator(100, 10, 10, new Date());
    }
    
    public static void Parcelator(double valor, double juros, int numParcelas, Date data){
        double valorParcela = ceil(valor/numParcelas);
        double resto = valorParcela + (valor - valorParcela*numParcelas);
        valorParcela = valorParcela + valorParcela * (juros/100);
        resto = resto + (resto * (juros/100));
        
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MMM/yyyy");
        calendar.setTime(data);
        
        for(int x = 1; x <= numParcelas; x++){
            calendar.add(Calendar.MONTH, 1);
            System.out.println("Data: "+formato.format(calendar.getTime()));
            if(x==1 && resto!=0){
                System.out.println(resto);
            }else{
                System.out.println(valorParcela);
            }
        }
    }
}
