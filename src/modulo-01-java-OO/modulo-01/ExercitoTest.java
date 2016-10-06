

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ExercitoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ExercitoTest
{
    @Test
    public void adicionarElfoNormal(){
        Exercito bimtz = new Exercito();
        Elfo e = new Elfo("Elf");
        bimtz.alistarUmEmfo(e) ;
        
        boolean naoAlistou = bimtz.getExercito().size() == 0;
        
        assertTrue(naoAlistou);
    }
    
    @Test
    public void adicionarElfoVerde(){
        Exercito bimtz = new Exercito();
        ElfoVerde e = new ElfoVerde("Elf");
        bimtz.alistarUmEmfo(e) ;
        
        boolean deuCerto = bimtz.getExercito().get(0).getNome() == e.getNome();
        
        assertTrue(deuCerto);
    }
    
    @Test
    public void adicionarElfoNoturno(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        bimtz.alistarUmEmfo(e) ;
        
        boolean deuCerto = bimtz.getExercito().get(0).getNome() == e.getNome();
        
        assertTrue(deuCerto);
    }
    
    @Test
    public void adicionarNovoElfoElfoNoturno(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        bimtz.alistarUmEmfo(e) ;
        
        boolean deuCerto = bimtz.getExercito().get(0).getNome() == new Elfo("Dark").getNome();
        
        assertTrue(deuCerto);
    }
    
    @Test
    public void adicionarElfoNoturnoEElfoVerdeAoExercitoEElfoNormal(){
        Exercito bimtz = new Exercito();
        Elfo dark = new ElfoNoturno("Dark");
        Elfo green = new ElfoVerde("Elf");
        Elfo normal = new Elfo("Elf");
        bimtz.alistarUmEmfo(green) ;
        bimtz.alistarUmEmfo(dark) ;
        
        boolean deuCerto = bimtz.getExercito().contains(green) && bimtz.getExercito().contains(dark) && bimtz.getExercito().size() == 2;
        
        assertTrue(deuCerto);
    }
    
    @Test
    public void buscarExercitoVazio(){
        Exercito bimtz = new Exercito();
        assertNull(bimtz.buscarElfoPorNome("a"));
    }
    
    @Test
    public void buscarElfoPorNomeAndEncontrar(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        bimtz.alistarUmEmfo(e) ;
        
        boolean encontrou = bimtz.buscarElfoPorNome("Dark") != null;
        
        assertTrue(encontrou);
    }
    
    @Test
    public void buscarElfoPorNomeAndNaoEncontrar(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Donnie Darko");
        ElfoNoturno e1 = new ElfoNoturno("Darko");
        bimtz.alistarUmEmfo(e) ;
        
        boolean naoEncontrou = bimtz.buscarElfoPorNome("Armando") == null;
        
        assertTrue(naoEncontrou);
    }
   
    @Test
    public void buscarElfoPorNomeCom2ElfosComNomeIgual(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Dark");
        bimtz.alistarUmEmfo(e) ;
        bimtz.alistarUmEmfo(green) ;
        
        boolean encontrou = bimtz.buscarElfoPorNome(new Elfo("Dark").getNome()) != null;
        
        assertTrue(encontrou);
    }
    
    @Test
    public void buscarElfosComStatusVivo(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Gray");
        bimtz.alistarUmEmfo(e) ;
        bimtz.alistarUmEmfo(green) ;
        
        
        
        boolean buscou = bimtz.buscar(Status.VIVO).contains(e) && bimtz.buscar(Status.VIVO).contains(green);
        
        assertTrue(buscou);
    }
    
    @Test
    public void buscarElfosComStatusMortoNenhumMorto(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Gray");
        bimtz.alistarUmEmfo(e) ;
        bimtz.alistarUmEmfo(green) ;
        
        
        
        boolean buscouNenhum = bimtz.buscar(Status.MORTO).size() == 0;
        
        assertTrue(buscouNenhum);
    }
    
    @Test
    public void buscarElfosComStatusMorto(){
        Exercito bimtz = new Exercito();
        ElfoNoturno dark = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Gray");
        for(int x = 0; x < 90; x++){
            dark.atirarFlecha();
        }
        
        bimtz.alistarUmEmfo(dark) ;
        bimtz.alistarUmEmfo(green) ;
        
        boolean buscou = bimtz.buscar(Status.MORTO).size() == 1;
        
        assertTrue(buscou);
    }
    
    @Test
    public void buscarTodosElfosComExercitoVazio(){
        Exercito bimtz = new Exercito();
        ElfoNoturno dark = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Gray");
        
        boolean buscouNada = bimtz.buscar(Status.MORTO).size() == 0;
        
        assertTrue(buscouNada);
    }
    
}