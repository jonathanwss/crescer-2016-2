/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cwi.crescer.aula01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonathan-David
 */
public class Exercicio01Test {
    
    public Exercicio01Test() {
    }

    /**
     * Test of ValidarStringVazia method, of class Exercicio01.
     */
    @Test
    public void testValidarStringVazia() {
        String frase = "";
        boolean expResult = true;
        boolean result = Exercicio01.ValidarStringVazia(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testValidarStringVaziaPasandoPalavra() {
        String frase = "inter";
        boolean expResult = false;
        boolean result = Exercicio01.ValidarStringVazia(frase);
        assertEquals(expResult, result);
    }

    /**
     * Test of ContarNumeroDeVogais method, of class Exercicio01.
     */
    @Test
    public void testContarNumeroDeVogaispalavraSimples() {
        String frase = "aeiou";
        int expResult = 5;
        int result = Exercicio01.ContarNumeroDeVogais(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testContarNumeroDeVogaispalavraSimplesComLetrasMaiusculas() {
        String frase = "AEIOU";
        int expResult = 5;
        int result = Exercicio01.ContarNumeroDeVogais(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testContarNumeroDeVogaisPalavraComposta() {
        String frase = "jonathan william";
        int expResult = 6;
        int result = Exercicio01.ContarNumeroDeVogais(frase);
        assertEquals(expResult, result);
    }

    /**
     * Test of InverterString method, of class Exercicio01.
     */
    @Test
    public void testInverterStringComPalavraComposta() {
        String frase = "jonathan william";
        String expResult = "mailliw nahtanoj";
        StringBuilder result = Exercicio01.InverterString(frase);
        assertEquals(expResult, result.toString());
    }
    
    @Test
    public void testInverterStringComPalavraCompostaComLetraMaiuscula() {
        String frase = "Jonathan William";
        String expResult = "mailliW nahtanoJ";
        StringBuilder result = Exercicio01.InverterString(frase);
        assertEquals(expResult, result.toString());
    }
    
    @Test
    public void testInverterStringComPalavraSimples() {
        String frase = "ovo";
        String expResult = "ovo";
        StringBuilder result = Exercicio01.InverterString(frase);
        assertEquals(expResult, result.toString());
    }

    /**
     * Test of VerificarSeEhpalindromo method, of class Exercicio01.
     */
    @Test
    public void testVerificarSeEhpalindromoComPalavraSimples() {
        String frase = "ovo";
        boolean expResult = true;
        boolean result = Exercicio01.VerificarSeEhpalindromo(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificarSeEhpalindromoComPalavraComposta() {
        String frase = "ame a ema";
        boolean expResult = true;
        boolean result = Exercicio01.VerificarSeEhpalindromo(frase);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testVerificarSeEhpalindromoComPalavraCompostaEPrimeiraLetraMaiuscula() {
        String frase = "Ame a ema";
        boolean expResult = true;
        boolean result = Exercicio01.VerificarSeEhpalindromo(frase);
        assertEquals(expResult, result);
    }
    
}
