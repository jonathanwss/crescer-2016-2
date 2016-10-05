

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BatalhaoEspecialElfosTest
{    
    @After
    public void tearDown(){
        System.gc();
    }
    
    @Test
    public void alistarUmElfo(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        Elfo elfo = new ElfoVerde("Regis");
        
        bop.alistar(elfo.getNome(), elfo);
        
        assertEquals(1, bop.getEsquadrao().length); 
    }
    
    @Test
    public void alistarUmElfoVerdeEUmNoturno(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        Elfo green = new ElfoVerde("Regis");
        Elfo noturno = new ElfoNoturno("Hash");
        
        bop.alistar(green.getNome(), green);
        bop.alistar(noturno.getNome(), noturno);
        
        assertEquals(2, bop.getEsquadrao().length); 
    }
    
    @Test
    public void alistarUmElfoVerdeEUmNoturnoEnaoAdicionarUmNormal(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        Elfo green = new ElfoVerde("Regis");
        Elfo noturno = new ElfoNoturno("Hash");
        Elfo elfo = new Elfo("Hash");
        
        bop.alistar(green.getNome(), green);
        bop.alistar(noturno.getNome(), noturno);
        bop.alistar(elfo.getNome(), elfo);
        
        assertEquals(2, bop.getEsquadrao().length); 
    }
    
    @Test
    public void tentarAlistarUmElfoNormaEFalhar(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        Elfo elfo = new Elfo("Hash");
  
        bop.alistar(elfo.getNome(), elfo);
        
        assertEquals(0, bop.getEsquadrao().length); 
    }
    
    @Test
    public void naoAdicionarNehumElfoAoBatalhao(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        assertEquals(0, bop.getEsquadrao().length); 
    }
    
    @Test
    public void adicionarUmElfoQueSubstituiOutro(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        Elfo green = new ElfoVerde("Regis");
        Elfo noturno = new ElfoNoturno("Regis");
        
        bop.alistar(green.getNome(), green);
        bop.alistar(noturno.getNome(), noturno);
        
        
        assertEquals(1, bop.getEsquadrao().length); 
    }
    
    @Test
    public void buscarUmElfoPeloNome(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        
        Elfo noturno = new ElfoNoturno("Regis Danone");
        Elfo green = new ElfoVerde("Regis");
        
        bop.alistar(noturno.getNome(), noturno);
        bop.alistar(green.getNome(), green);
        
        boolean achou = bop.buscar("Regis Danone") != null;
        
        assertTrue(achou);
    }
    
    @Test
    public void buscarUmElfoPeloNomeENaoAchar(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        
        Elfo noturno = new ElfoNoturno("Regis Danone");
        Elfo green = new ElfoVerde("Regis");
        
        bop.alistar(noturno.getNome(), noturno);
        bop.alistar(green.getNome(), green);
        
        boolean achou = bop.buscar("Regis danone") != null;
        
        
        assertFalse(achou);
    }
    
    @Test
    public void buscarUmElfoHashVazio(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        
        Elfo noturno = new ElfoNoturno("Regis Danone");
        Elfo green = new ElfoVerde("Regis");
        
        boolean achou = bop.buscar("Regis danone") != null;
        
        assertFalse(achou);
    }
    
    @Test
    public void buscarDoisElfosPeloNomeDentreMultiplos(){
        BatalhaoEspecialElfos bop = new BatalhaoEspecialElfos();
        
        
        Elfo elfo = new ElfoNoturno("recruta1");
        Elfo elfo2 = new ElfoVerde("recruta2");
        Elfo elfo3 = new ElfoNoturno("recruta3");
        Elfo elfo4 = new ElfoVerde("recruta4");
        
        
        bop.alistar(elfo.getNome(), elfo);
        bop.alistar(elfo2.getNome(), elfo2);
        bop.alistar(elfo3.getNome(), elfo3);
        bop.alistar(elfo4.getNome(), elfo4);
        
        boolean achou = bop.buscar("recruta1") != null;
        boolean achouTambem = bop.buscar("recruta3") != null;
        
        assertTrue(achou);
        assertTrue(achouTambem);
    }
    
    
}
