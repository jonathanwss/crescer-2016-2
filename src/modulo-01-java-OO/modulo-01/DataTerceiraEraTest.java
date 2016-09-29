import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class DataTerceiraEraTest
{
    @Test
    public void verificarAnoEhBissexto(){
        DataTerceiraEra dte = new DataTerceiraEra(16,9,2016);
        
        boolean ehBissexto = dte.ehBissexto();
        
        assertTrue(ehBissexto);
    }
    
    @Test
    public void verificarAnoNaoEhBissexto(){
        DataTerceiraEra dte = new DataTerceiraEra(16,9,2015);
        
        boolean ehBissexto = dte.ehBissexto();
        
        assertFalse(ehBissexto);
    }
    
    @Test
    public void criarData(){
        DataTerceiraEra dte = new DataTerceiraEra(20,89,3333);
        
        assertEquals(20, dte.getDia());
        assertEquals(89, dte.getMes());
        assertEquals(3333, dte.getAno());
    }
}
