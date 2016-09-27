

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfoTest
{
    @Test
    public void elfoNasceComNome(){
        //Arrange
        String nomeEsperado = "Clark Kent";
        //Act
        Elfo clarkKent = new Elfo(nomeEsperado);
        //Assert
        assertEquals(nomeEsperado, clarkKent.getNome());
    }
    
     @Test
    public void elfoNasceComArco(){
        //Arrange
       Item arco = new Item("Arco",1);
        //Act
        Elfo newElfo = new Elfo("a");
        //Assert
        assertEquals(arco.getDescricao(), newElfo.getArco().getDescricao());
    }
}