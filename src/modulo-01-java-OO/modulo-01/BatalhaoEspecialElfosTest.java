

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
}
