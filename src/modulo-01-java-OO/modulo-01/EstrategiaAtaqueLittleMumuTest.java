

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class EstrategiaAtaqueLittleMumuTest
{
    @Test
    public void retornaNumElfoCorretosSemOrdenarDaFormaDesejada(){
        EstrategiaAtaqueLittleMumu mumuzinho = new EstrategiaAtaqueLittleMumu();
        
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("",0);
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
        
        List<Elfo> resultado = mumuzinho.getOrdemDeAtaque(combatentes);
        
        assertEquals(3, resultado.size());
        
    }
    
     @Test
    public void retornaNumElfoCorretosSemOrdenarDaFormaDesejada2(){
        EstrategiaAtaqueLittleMumu mumuzinho = new EstrategiaAtaqueLittleMumu();
        
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("",0);
        ElfoNoturno elfo2 = new ElfoNoturno("a");
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoNoturno elfo4 = new ElfoNoturno("");
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoNoturno elfo6 = new ElfoNoturno("");
        ElfoNoturno elfo7 = new ElfoNoturno("");
        ElfoNoturno elfo8 = new ElfoNoturno("");
        
        combatentes.add(elfo1);
        combatentes.add(elfo2);
        combatentes.add(elfo3);
        combatentes.add(elfo4);
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = mumuzinho.getOrdemDeAtaque(combatentes);
        
       
        
        
        assertEquals(4, resultado.size());
        
    }
    
    private ElfoNoturno matarElfo(){
        ElfoNoturno suicida = new ElfoNoturno("",100);
        for(int x = 0; x < 100; x++){
            suicida.atirarFlecha();
        }
        return suicida;
    }
    
    @Test
    public void retornaNumElfoCorretosOrdenarDaFormaDesejada(){
        EstrategiaAtaqueLittleMumu mumuzinho = new EstrategiaAtaqueLittleMumu();
        
        ArrayList<Elfo> combatentes = new ArrayList<>();
        
        ElfoVerde elfo1 = new ElfoVerde("",0);
        ElfoNoturno elfo2 = new ElfoNoturno("f",100);
        ElfoVerde elfo3 = new ElfoVerde("");
        ElfoNoturno elfo4 = new ElfoNoturno("");
        ElfoVerde elfo5 = new ElfoVerde("");
        ElfoNoturno elfo6 = new ElfoNoturno("");
        ElfoNoturno elfo7 = new ElfoNoturno("");
        ElfoNoturno elfo8 = new ElfoNoturno("");
        
        combatentes.add(elfo1);
        combatentes.add(elfo2);
        combatentes.add(elfo3);
        combatentes.add(elfo4);
        combatentes.add(elfo5);
        combatentes.add(elfo6);
        combatentes.add(elfo7);
        combatentes.add(elfo8);
        
        List<Elfo> resultado = mumuzinho.getOrdemDeAtaque(combatentes);
        
        boolean elfoComMaisFlechas = resultado.get(0).getNome().equals("f");
        
        assertEquals(4, resultado.size());
        assertTrue(elfoComMaisFlechas);
    }
    
    
}












