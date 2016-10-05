
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;

public class ElfoTest
{
    @After
    public void tearDown(){
        System.gc();
    }
    
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
        assertEquals(1, legolas. getExperiencia());
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
        assertEquals(100, balin.getVida(),0);
    }

    @Test
    public void elfoAtiraDuasFlechaEmUmDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(balin);
        assertEquals(90, balin.getVida(),0);
    }

    @Test
    public void elfoAtiraUmaFlechaEmCadaDwarf() {
        Elfo elfo = new Elfo("Batman");
        Dwarf balin = new Dwarf();
        Dwarf gloin = new Dwarf();
        elfo.atirarFlecha(balin);
        elfo.atirarFlecha(gloin);
        assertEquals(100, balin.getVida(),0);
        assertEquals(100, gloin.getVida(),0);
    }

    @Test
    public void elfoToStringComInformacoesIniciais() {
        Elfo legolas = new Elfo("Legolas");
        assertEquals("Legolas possui 42 flechas e 0 nível de experiência.",
            legolas.toString());

    }

    @Test
    public void elfoAtiraFlechaEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 41 flechas e 1 nível de experiência.",
            legolas.toString());

    }

    @Test
    public void elfoAtiraDuasFlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
        legolas.atirarFlecha(new Dwarf());
        legolas.atirarFlecha(new Dwarf());
        assertEquals("Legolas possui 40 flechas e 2 níveis de experiência.",
            legolas.toString());

    }
    
    @Test
    public void elfoAtira41FlechasEToString() {
        Elfo legolas = new Elfo("Legolas");
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
        assertEquals("Legolas possui 1 flecha e 41 níveis de experiência.",
            legolas.toString());
    }
    
    @Test
    public void criarElfoInformandoFlechas() {
        Elfo elrond = new Elfo("Elrond", 56);
        assertEquals(56, elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoZeroFlechas() {
        Elfo elrond = new Elfo("Elrond", 0);
        assertEquals(0, elrond.getFlecha().getQuantidade());
    }
    
    @Test
    public void criarElfoInformandoFlechasNegativas() {
        Elfo elrond = new Elfo("Elrond", -56);
        assertEquals(42, elrond.getFlecha().getQuantidade());
    }
    
    @Test public void elfoNasceVivo() {
        Elfo elfo = new Elfo("Cobaia");
        assertEquals(Status.VIVO, elfo.getStatus());
    }
    
    @Test
    public void adicionandoArcoFlechaMochilaElfo(){
        Elfo f = new Elfo("Lefo");
        
        boolean arco = "Arco".equals(f.getMochila().getListadeItens().get(0).getDescricao());
        boolean flecha = "Flechas".equals(f.getMochila().getListadeItens().get(1).getDescricao());
        
        assertTrue(arco);
        assertTrue(flecha);
    }
    
    @Test
    public void adicionandoArcoMochilaElfo(){
        Elfo f = new Elfo("Lefo");
      
        
        boolean arco = "Arco".equals(f.getMochila().getListadeItens().get(0).getDescricao());
        
        assertTrue(arco);
    }
    
    @Test
    public void adicionandoFlechaMochilaElfo(){
        Elfo f = new Elfo("Lefo");
       
        
        boolean flecha = "Flechas".equals(f.getMochila().getListadeItens().get(1).getDescricao());
        
        assertTrue(flecha);
    }
    
    @Test
    public void verificarMaiorQtdItensAdicionandoArcoFlechaAtirandoEmUmAnao(){
        Elfo f = new Elfo("Lefo");
 
        Dwarf dwarf = new Dwarf();
        
        f.atirarFlecha(dwarf);
        
        Item obj = f.getMochila().itemMaiorQtd();
        
        assertEquals("Flechas", obj.getDescricao());
        assertEquals(41, obj.getQuantidade());
    }
    
    @Test
    public void verificarVidaInicialElfo(){
        Elfo e = new Elfo("leg");
        
        double vida = e.getVida();
        
        assertEquals(100, vida,0);
    }
    
    @Test
    public void contadorDeElfos(){
        new ElfoVerde("Jacinto");
        new ElfoNoturno("Cleide");
        new Elfo("Jarbas");
        assertEquals(3,Elfo.getContadorElfo());
    }
    
    @Test
    public void contadorDeElfosVariosElfos(){
        new ElfoVerde("Jacinto");
        new ElfoNoturno("Cleide");
        new Elfo("Jarbas");
        new ElfoVerde("Jacinto");
        new ElfoNoturno("Cleide");
        new Elfo("Jarbas");
        new ElfoVerde("Jacinto");
        new ElfoNoturno("Cleide");
        new Elfo("Jarbas");
        new ElfoVerde("Jacinto");
        new ElfoNoturno("Cleide");
        new Elfo("Jarbas");
        assertEquals(12,Elfo.getContadorElfo());
    }
}



