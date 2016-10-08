
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class AtaqueIntercaladoTest
{
    @Test
    public void ataqueIntercaladoElfoNoturnoPrimeiro() throws ContingenteDesproporcionalException{
        ArrayList<Elfo> atacantes = new ArrayList<>();
        AtaqueIntercalado umOutro = new AtaqueIntercalado();

        ElfoNoturno elfo1 = new ElfoNoturno("");
        ElfoVerde elfo2 = new ElfoVerde("");
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoNoturno elfo4 = new ElfoNoturno("");
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoVerde elfo6 = new ElfoVerde("");
        ElfoNoturno elfo7 = new ElfoNoturno("");
        ElfoNoturno elfo8 = new ElfoNoturno("");
        atacantes.add(elfo1);
        atacantes.add(elfo2);
        atacantes.add(elfo3);
        atacantes.add(elfo4);
        atacantes.add(elfo5);
        atacantes.add(elfo6);
        atacantes.add(elfo7);
        atacantes.add(elfo8);

        List<Elfo> resultado = umOutro.getOrdemDeAtaque(atacantes);

        boolean primeiraPosicao = resultado.get(0) instanceof ElfoNoturno;
        boolean segundaPosicao = resultado.get(1) instanceof ElfoVerde;
        assertTrue(primeiraPosicao);
        assertTrue(segundaPosicao);
    }
    
     @Test
    public void ataqueIntercaladoElfoVerdePrimeiro() throws ContingenteDesproporcionalException{
        ArrayList<Elfo> atacantes = new ArrayList<>();
        AtaqueIntercalado umOutro = new AtaqueIntercalado();

        ElfoVerde elfo1 = new ElfoVerde("");
        ElfoVerde elfo2 = new ElfoVerde("");
        ElfoNoturno elfo3 = new ElfoNoturno("");
        ElfoNoturno elfo4 = new ElfoNoturno("");
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoVerde elfo6 = new ElfoVerde("");
        ElfoNoturno elfo7 = new ElfoNoturno("");
        ElfoNoturno elfo8 = new ElfoNoturno("");
        atacantes.add(elfo1);
        atacantes.add(elfo2);
        atacantes.add(elfo3);
        atacantes.add(elfo4);
        atacantes.add(elfo5);
        atacantes.add(elfo6);
        atacantes.add(elfo7);
        atacantes.add(elfo8);

        List<Elfo> resultado = umOutro.getOrdemDeAtaque(atacantes);

        boolean primeiraPosicao = resultado.get(0) instanceof ElfoVerde;
        boolean segundaPosicao = resultado.get(1) instanceof ElfoNoturno;
        assertTrue(primeiraPosicao);
        assertTrue(segundaPosicao);
    }
    
    @Test
    public void ataqueIntercaladoNaoOcorre() throws ContingenteDesproporcionalException{
        ArrayList<Elfo> atacantes = new ArrayList<>();
        AtaqueIntercalado umOutro = new AtaqueIntercalado();

        ElfoVerde elfo1 = new ElfoVerde("");
        ElfoVerde elfo2 = new ElfoVerde("");
        ElfoNoturno elfo3 = new ElfoNoturno("");
        ElfoNoturno elfo4 = new ElfoNoturno("");
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoVerde elfo6 = new ElfoVerde("");
        ElfoNoturno elfo7 = new ElfoNoturno("");
        ElfoNoturno elfo8 = new ElfoNoturno("");
        atacantes.add(elfo1);
        atacantes.add(elfo2);
        atacantes.add(elfo3);
        atacantes.add(elfo4);
        atacantes.add(elfo5);
        atacantes.add(elfo6);
        atacantes.add(elfo7);

        List<Elfo> resultado = umOutro.getOrdemDeAtaque(atacantes);

        boolean primeiraPosicao = resultado.get(0) instanceof ElfoVerde;
        boolean segundaPosicao = resultado.get(1) instanceof ElfoNoturno;
        
    }
}
