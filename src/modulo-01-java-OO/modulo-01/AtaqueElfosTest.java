

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class AtaqueElfosTest
{
    @Test
    public void ordenarElfosVerdesPrimeiroEDepoisNoturnosOrdemAleatoria(){
        AtaqueElfos gregoEstrategia = new AtaqueElfos();
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("");
        ElfoNoturno elfo2 = matarElfo();
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoNoturno elfo4 = matarElfo();
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoNoturno elfo6 = new ElfoNoturno("");
        ElfoNoturno elfo7 = matarElfo();
        ElfoNoturno elfo8 = new ElfoNoturno("");
        
        combatentes.add(elfo1);
        combatentes.add(elfo2);
        combatentes.add(elfo3);
        combatentes.add(elfo4);
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = gregoEstrategia.getOrdemDeAtaque(combatentes);
        
        assertEquals(5, resultado.size());
        assertEquals(elfo1, resultado.get(0));
        assertEquals(elfo3, resultado.get(2));
        assertEquals(elfo8, resultado.get(4));
    }
    
    @Test
    public void ordenarElfosVerdesPrimeiroEDepoisNoturnos(){
        AtaqueElfos gregoEstrategia = new AtaqueElfos();
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("");
        ElfoVerde elfo2 = new ElfoVerde("");
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoVerde elfo4 = new ElfoVerde("");
        ElfoNoturno elfo5 = matarElfo();
        ElfoNoturno elfo6 = new ElfoNoturno("");
        ElfoNoturno elfo7 = matarElfo();
        ElfoNoturno elfo8 = new ElfoNoturno("");
        
        combatentes.add(elfo1);
        combatentes.add(elfo2);
        combatentes.add(elfo3);
        combatentes.add(elfo4);
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = gregoEstrategia.getOrdemDeAtaque(combatentes);
        
        assertEquals(6, resultado.size());
        assertEquals(elfo1, resultado.get(0));
        assertEquals(elfo6, resultado.get(4));
    }
    
    @Test
    public void adicionarSomenteElfosNoturnosMortos(){
         AtaqueElfos gregoEstrategia = new AtaqueElfos();
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoNoturno elfo5 = matarElfo();
        ElfoNoturno elfo6 = matarElfo();
        ElfoNoturno elfo7 = matarElfo();
        ElfoNoturno elfo8 = matarElfo();
        
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = gregoEstrategia.getOrdemDeAtaque(combatentes);
        
        assertEquals(0, resultado.size());

    }
    
    @Test
    public void adicionarSomenteElfosNoturnosComAlgunsMortos(){
         AtaqueElfos gregoEstrategia = new AtaqueElfos();
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoNoturno elfo5 = matarElfo();
        ElfoNoturno elfo6 = new ElfoNoturno("");
        ElfoNoturno elfo7 = matarElfo();
        ElfoNoturno elfo8 = new ElfoNoturno("");
        
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = gregoEstrategia.getOrdemDeAtaque(combatentes);
        
        assertEquals(2, resultado.size());
        assertEquals(elfo6, resultado.get(0));
    }
    
    @Test
    public void adicionarSomenteElfosVerdes(){
         AtaqueElfos gregoEstrategia = new AtaqueElfos();
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("");
        ElfoVerde elfo2 = new ElfoVerde("");
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoVerde elfo4 = new ElfoVerde("");
        
        combatentes.add(elfo1);
        combatentes.add(elfo2);
        combatentes.add(elfo3);
        combatentes.add(elfo4);
        
        List<Elfo> resultado = gregoEstrategia.getOrdemDeAtaque(combatentes);
        
        assertEquals(4, resultado.size());
        assertEquals(elfo1, resultado.get(0));
        assertTrue(resultado.contains(elfo4));
    }
    
    private ElfoNoturno matarElfo(){
        ElfoNoturno suicida = new ElfoNoturno("",100);
        for(int x = 0; x < 100; x++){
            suicida.atirarFlecha();
        }
        return suicida;
    }
    
}
