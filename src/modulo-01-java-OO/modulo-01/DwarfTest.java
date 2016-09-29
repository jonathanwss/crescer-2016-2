import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DwarfTest
{
    @Test
    public void dwarfNasceCom110Vida() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        assertEquals(110, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaUmaVez() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        gimli.perderVida();
        assertEquals(100, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaDuasVezes() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(90, gimli.getVida());
    }

    @Test
    public void dwarfPerdeVidaVinteVezes() {
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf gimli = new Dwarf("Gimli", nascimento);
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        gimli.perderVida();
        assertEquals(-90, gimli.getVida());
    }
    
    @Test
    public void verificarDataNascimentoNomeDwarf(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf cartman = new Dwarf("cartman", nascimento);
        
        assertEquals("cartman", cartman.getNome());
        assertEquals(2016, nascimento.getAno());
        assertEquals(16, nascimento.getDia());
        assertEquals(9, nascimento.getMes());
        
    }
    
    
    @Test
    public void verificarDataNascimentoNomeDwarfAnoNaoBissexto(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2015);
        Dwarf cartman = new Dwarf("cartman", nascimento);
        
        assertEquals("cartman", cartman.getNome());
        assertEquals(2015, nascimento.getAno());
        assertEquals(16, nascimento.getDia());
        assertEquals(9, nascimento.getMes());
        assertFalse(nascimento.ehBissexto());
        
    }
    
    @Test
    public void verificarDataNascimentoNomeDwarfAnoBissexto(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf cartman = new Dwarf("cartman", nascimento);
        
        assertEquals("cartman", cartman.getNome());
        assertEquals(2016, nascimento.getAno());
        assertEquals(16, nascimento.getDia());
        assertEquals(9, nascimento.getMes());
        assertTrue(nascimento.ehBissexto());
        
    }
    
    @Test
    public void resultadoNumeroSorteEhNegativo(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf cartman = new Dwarf("cartman", nascimento);
        Elfo kyle = new Elfo("Kyle");
        
        kyle.atirarFlecha(cartman);
        kyle.atirarFlecha(cartman);
        double numSorte = cartman.getNumeroSorte();
        
        assert(-3333==numSorte);
    }
    
    @Test
    public void resultadoNumeroSorteEhPositivo(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2015);
        Dwarf cartman = new Dwarf("Meirelles", nascimento);
        
        double numSorte = cartman.getNumeroSorte();
        
        assert(numSorte>0);
    }
    
    @Test
    public void resultadoNumeroSortePadrao(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2015);
        Dwarf cartman = new Dwarf("Cartman", nascimento);
        
        double numSorte = cartman.getNumeroSorte();
        
        assert(numSorte==101);
    }
    
    @Test
    public void resultadoNumeroSorteEhnumSorteDwarfGanha2XP(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2016);
        Dwarf cartman = new Dwarf("cartman", nascimento);
        Elfo kyle = new Elfo("Kyle");
        
        cartman.ganhar2xp();
        kyle.atirarFlecha(cartman);
        kyle.atirarFlecha(cartman);
        double numSorte = cartman.getNumeroSorte();
        
        assert(numSorte<0);
        assertEquals(2, cartman.getXp());
    }
    
    @Test
    public void resultadoNumeroSorteEhPositivoDwarfNaoRecebeFlecha(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2015);
        Dwarf cartman = new Dwarf("Meirelles", nascimento);
        
        double numSorte = cartman.getNumeroSorte();
        
        assert(numSorte>=0 && numSorte<=100);
    }
    
    @Test
    public void resultadoNumeroSorteMaiorQueSemDwarfTomaUmaFlecha(){
        DataTerceiraEra nascimento = new DataTerceiraEra(16,9,2015);
        Dwarf cartman = new Dwarf("Cartman", nascimento);
        Elfo kyle = new Elfo("Kyle");
        kyle.atirarFlecha(cartman);
        double numSorte = cartman.getNumeroSorte();
        
        assert(numSorte>100);
        assertEquals(100, cartman.getVida());
    }
    
}



