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
    
}



