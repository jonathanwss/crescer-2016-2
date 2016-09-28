
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
    public void elfoAtirarFlecha(){
        Elfo legolas = new Elfo("a");
        
        
    }

    @Test
    public void elfoNasceCom42Flechas() {
        // Act
        Elfo elfoDoTeste = new Elfo("Elrond");
        // Assert
        assertEquals("Flechas", elfoDoTeste.getFlecha().getDescricao());
        assertEquals(42, elfoDoTeste.getFlecha().getQuantidade());
    }

    @Test
    public void elfoAtiraUmaFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(41, legolas.getFlecha().getQuantidade());
        assertEquals(1, legolas.getExperiencia());
    }

    @Test
    public void elfoAtiraDuasFlecha() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(40, legolas.getFlecha().getQuantidade());
        assertEquals(2, legolas.getExperiencia());
    }

    @Test
    public void elfoNaoAtiraFlecha() {
        // Arrange & Act
        Elfo legolas = new Elfo("Elfo");
        // Assert
        assertEquals(42, legolas.getFlecha().getQuantidade());
        assertEquals(0, legolas.getExperiencia());
    }

    @Test
    public void elfoAtira42Flechas() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(0, legolas.getFlecha().getQuantidade());
        assertEquals(42, legolas.getExperiencia());
    }

    @Test
    public void elfoAtira43Flechas() {
        // Arrange
        Elfo legolas = new Elfo("Elfo");
        // Act
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        // Assert
        assertEquals(0, legolas.getFlecha().getQuantidade());
        assertEquals(42, legolas.getExperiencia());
    }

    @Test
    public void elfoAtiraFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        assertEquals(100, balin.getVida());
    }

    @Test
    public void elfoAtiraDuasFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(balin);
        assertEquals(90, balin.getVida());
    }

    @Test
    public void elfoAtiraUmaFlechaEmCadaDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        Dwarf gloin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(gloin);
        assertEquals(100, balin.getVida());
        assertEquals(100, gloin.getVida());
    }
    
    @Test
    public void toStringUmElfoTeste(){
        Elfo f = new Elfo("a");
        
        String frase = f.toString();
        
       String fraseEsperada = "a possui 42 flechas e 0 niveis de experiencia";
        
     
        assertEquals(fraseEsperada, frase);
    }
    
    
    @Test
    public void toStringDoisElfosTeste(){
        Elfo f = new Elfo("a");
        Elfo f1 = new Elfo("b");
        
        String frase = f.toString();
        String frase2 = f.toString();
        
       String fraseEsperada = "a possui 42 flechas e 0 niveis de experiencia";
       String fraseEsperada2 = "a possui 42 flechas e 0 niveis de experiencia";
        
     
        assertEquals(fraseEsperada, frase);
        assertEquals(fraseEsperada2, frase2);
    }
    
    @Test
    public void escolherNumeroDeFlechasUmElfo(){
        Elfo feldon = new Elfo("Feldon", 16);
        
        assertEquals(16, feldon.getFlecha().getQuantidade());
    }
    
    @Test
    public void escolherNumeroDeFlechasDoisElfos(){
        Elfo shimira = new Elfo("shimira", 29);
        
        assertEquals(29, shimira.getFlecha().getQuantidade());
    }
}




