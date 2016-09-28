

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        CestoDeLembas lemba = new CestoDeLembas(4);
        
        assertEquals(true, lemba.podeDividirEmPar());
    }
}
