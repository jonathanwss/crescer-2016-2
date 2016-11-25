/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio02Test {

    @Test
    public void testTempoDecorridoEmDias() throws Exception {
        
        long result = Exercicio02.TempoDecorridoEmDias("24/11/2016");
        assertEquals(1, result);
    }

    @Test
    public void testTempoDecorridoEmFormatoData() throws Exception {

        String result = Exercicio02.TempoDecorridoEmFormatoData(Exercicio02.TempoDecorridoEmDias("24/11/2016"));
        assertEquals("1 dia(s) "+"0"+" mes(es) "+"0"+" ano(s)", result);
        
    }
    
}
