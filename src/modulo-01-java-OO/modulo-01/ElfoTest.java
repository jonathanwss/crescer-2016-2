
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
    public void saberSeAtirouOuNaoFlecha(){
        Elfo alf = new Elfo("Elrond");

        alf.atirarFlecha(1);

        assert(alf.getNumFlechas()>0);
    }
    //verificar se vai ficar um número positivo de flechas
    @Test
    public void verificarQuantidadeDeFlechasAposTiro(){
        Elfo elf = new Elfo("reinaldo");
        
        elf.atirarFlecha(44);

        assert(elf.getFlecha().getQuantidade()>=0);
    }
    
    @Test
    public void testeMatouDwarve(){
        Elfo e = new Elfo("Fergus");
        
        Dwarve d = new Dwarve();
        
        e.cacarAnao(11, d);
        
        assert(d.getPontosDeVida()<=0);
    }
    
    //caso o nº de flechas seja igual a um numero gerado aleatoriamente o dano será crítico
    @Test
    public void danoCritico(){
        Random r = new Random();
        
        Elfo f = new Elfo("churumidas");
        
        f.atirarFlecha(2);
        
        int random = r.nextInt(10);
        
        assertEquals(random, f.getNumFlechas());
    }
    
    @Test
    public void atirarUmaFlecha(){
        Elfo g = new Elfo("night");
        
        int numFlechas = 1;
        g.atirarFlecha(numFlechas);
        
        assertEquals(1, g.getNumFlechas());
        
    }
}