

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ElfosVerdesTest
{
    @Test 
    public void adicionarItemPermitido(){
        ElfosVerdes elf = new ElfosVerdes("elf");
        elf.adicionarItem(new Item("Flechas de vidro",40));
        
        
        String a = elf.getMochila().getListadeItens().get(2).getDescricao();
        
        assert(a.equals("Flechas de vidro"));
    }
    
    @Test 
    public void verificarItensIniciais(){
        ElfosVerdes elf = new ElfosVerdes("elf");
        
        boolean taCerto = elf.getMochila().getListadeItens().get(0).getDescricao().equals("Arco de vidro") && 
                          elf.getMochila().getListadeItens().get(1).getDescricao().equals("Flechas de vidro");
        
        assertTrue(taCerto);
    }
    
    @Test
    public void ganharDobroXpDeElfosNormais(){
        ElfosVerdes jim = new ElfosVerdes("Jim");
        
        jim.atirarFlechaDobroXp();
        
        int xp = jim.getExperiencia();
        
        assertEquals(2, xp);
    }
    
    @Test
    public void ganharDobroXpDeElfosNormaisAtirando3Vezes(){
        ElfosVerdes jim = new ElfosVerdes("Jim");
        
        jim.atirarFlechaDobroXp();
        jim.atirarFlechaDobroXp();
        jim.atirarFlechaDobroXp();
        
        int xp = jim.getExperiencia();
        
        assertEquals(6, xp);
    }
    
    @Test
    public void elfoVerdeNasceCom100DeVida(){
        ElfosVerdes elf = new ElfosVerdes("elf");
        
        double vida = elf.getVida();
        
        assertEquals(100, vida,0);
    }
}
