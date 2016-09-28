
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

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

    @Test 
    public void elfoNasceComFlechas(){
        Item flecha = new Item("flecha",42);

        Elfo newElfo = new Elfo("Galadriel");

        assertEquals(flecha.getQuantidade(), newElfo.getFlecha().getQuantidade());
    }

    @Test
    public void elfoAtiraUmaFlecha(){
        Elfo alf = new Elfo("Elrond");

        alf.atirarFlecha();

        assertEquals(41, alf.getFlecha().getQuantidade());
    }
    
    @Test
    public void elfoAtirarFlecha(){
        Elfo legolas = new Elfo("a");
        
        
    }
}