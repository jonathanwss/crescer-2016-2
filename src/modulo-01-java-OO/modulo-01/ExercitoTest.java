

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
    public void adicionarElfoNoturnoEElfoVerdeAoExercito(){
        Exercito bimtz = new Exercito();
        ElfoNoturno dark = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Elf");
        bimtz.alistarUmEmfo(green) ;
        bimtz.alistarUmEmfo(dark) ;
        
        boolean deuCerto = bimtz.getExercito().get(0).getNome() == green.getNome() && bimtz.getExercito().get(1).getNome() == dark.getNome();
        
        assertTrue(deuCerto);
    }
    
    @Test
    public void buscarElfoPorNomeAndEncontrar(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        bimtz.alistarUmEmfo(e) ;
        
        boolean encontrou = bimtz.buscarElfoPorNome(e) != null;
        
        assertTrue(encontrou);
    }
    
    @Test
    public void buscarElfoPorNomeAndNaoEncontrar(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Donnie Darko");
        ElfoNoturno e1 = new ElfoNoturno("Darko");
        bimtz.alistarUmEmfo(e) ;
        
        boolean naoEncontrou = bimtz.buscarElfoPorNome(e1) == null;
        
        assertTrue(naoEncontrou);
    }
   
    @Test
    public void buscarElfoPorNomeCom2ElfosComNomeIgual(){
        Exercito bimtz = new Exercito();
        ElfoNoturno e = new ElfoNoturno("Dark");
        ElfoVerde green = new ElfoVerde("Dark");
        bimtz.alistarUmEmfo(e) ;
        bimtz.alistarUmEmfo(green) ;
        
        boolean encontrou = bimtz.buscarElfoPorNome(new Elfo("Dark")) != null;
        
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
    
    
    
}
