<<<<<<< HEAD


=======
>>>>>>> master
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

<<<<<<< HEAD
/**
 * A classe de teste CestoDeLembasTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class CestoDeLembasTest
{
    @Test
    public void verificarSePodeSerDivididoEmPares(){
        CestoDeLembas lemba = new CestoDeLembas(100);
        
        assertEquals(true, lemba.podeDividirEmPar());
    }
}
=======
public class CestoDeLembasTest
{
    @Test
    public void dividirCestoComUmPao() {
        // Arrange
        CestoDeLembas cesto = new CestoDeLembas(1);
        // Act & Assert
        assertFalse(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComDoisPaes() {
        // Arrange
        CestoDeLembas cesto = new CestoDeLembas(2);
        // Act & Assert
        assertFalse(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComQuatroPaes() {
        // Arrange
        CestoDeLembas cesto = new CestoDeLembas(4);
        // Act & Assert
        assertTrue(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoCom101Paes() {
        // Arrange
        CestoDeLembas cesto = new CestoDeLembas(101);
        // Act & Assert
        assertFalse(cesto.podeDividirEmPares());
    }
    
    @Test
    public void dividirCestoComMenos6Paes() {
        // Arrange
        CestoDeLembas cesto = new CestoDeLembas(-6);
        // Act & Assert
        assertFalse(cesto.podeDividirEmPares());
    }
}












>>>>>>> master
