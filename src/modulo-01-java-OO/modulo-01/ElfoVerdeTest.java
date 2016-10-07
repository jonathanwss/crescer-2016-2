

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfoVerdeTest
{
     
    
    @Test 
    public void verificarItemInicial(){
        ElfoVerde elf = new ElfoVerde("elf");
        elf.adicionarItem(new Item("Arco e Flechas de vidro",40));
        
        
        String a = elf.getMochila().getListadeItens().get(0).getDescricao();
        String b = elf.getMochila().getListadeItens().get(1).getDescricao();
        
        assert(a.equals("Arco de vidro"));
        assert(b.equals("Flechas de vidro"));
    }
    
    @Test
    public void ganharDobroXpDeElfosNormais(){
        ElfoVerde jim = new ElfoVerde("Jim",42);
        
        jim.atirarFlecha();
        
        int xp = jim.getExperiencia();
        
        assertEquals(2, xp);
    }
    
    @Test
    public void ganharDobroXpDeElfosNormaisAtirando3Vezes(){
        ElfoVerde jim = new ElfoVerde("Jim",42);
        
        jim.atirarFlecha();
        jim.atirarFlecha();
        jim.atirarFlecha();
        
        int xp = jim.getExperiencia();
        
        assertEquals(6, xp);
    }
    
    @Test
    public void elfoVerdeNasceCom100DeVida(){
        ElfoVerde elf = new ElfoVerde("elf");
        
        double vida = elf.getVida();
        
        assertEquals(100, vida,0);
    }
    
    @Test public void elfoNoturnoNasce22Flechas(){
        Elfo eld = new ElfoVerde("a",22);
        
        assertEquals(22, eld.getFlecha().getQuantidade());
    }
}
