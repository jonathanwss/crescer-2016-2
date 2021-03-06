
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElfoNoturnoTest
{
    @Test
    public void elfoNoturnoGanhaOTripoDeXPAoAtirarUmaFlecha(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        dark.atirarFlecha();

        int xp = dark.getExperiencia();

        assertEquals(3, xp);

    }

    @Test
    public void elfoNoturnoGanhaOTripoDeXPAoAtirarTresFlechas(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();

        int xp = dark.getExperiencia();

        assertEquals(9, xp);

    }

    @Test
    public void elfoNoturnoPerde5PorCentoDaVidaCheia(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        dark.atirarFlecha();

        double vida = dark.getVida();

        assertEquals(95, vida,0);

    }
    
    @Test 
    public void elfoNoturnoTeste(){
        ElfoNoturno drak = new ElfoNoturno("a",100);
        for(int x = 0; x < 100;x++){
         drak.atirarFlecha();   
        }
        
        assertEquals(Status.MORTO, drak.getStatus());
    }

    @Test
    public void elfoNoturnoPerde5PorCentoDaVida2Vezes(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        dark.atirarFlecha();
        dark.atirarFlecha();

        double vida = dark.getVida();

        assertEquals(90.25, vida,0);

    }

    @Test
    public void elfoNoturnoPerde5PorCentoDaVida10Vezes(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();
        dark.atirarFlecha();

        double vida = dark.getVida();

        assertEquals(59.87369392383789, vida,0.1);

    }

    @Test
    public void elfoNoturnoMorreAposAtirarMuitasVezes(){
        ElfoNoturno dark = new ElfoNoturno("Dark");

        for(int x = 0; x < 101; x++){
            dark.atirarFlecha();
        }

        boolean morreu = dark.getStatus() == Status.MORTO;
        assertTrue(morreu);

    }

    @Test
    public void elfoNoturnoNaoAtiraMorto(){
        ElfoNoturno eld = new ElfoNoturno("a",91);
        for(int x = 1; x < 91; x++){
            eld.atirarFlecha();
            if(eld.getStatus() == Status.MORTO){
                break;
            }
        }

        assertEquals(270, eld.getExperiencia());

    }
    
    @Test public void elfoNoturnoNasce22Flechas(){
        ElfoNoturno eld = new ElfoNoturno("a",22);
        
        assertEquals(22, eld.getFlecha().getQuantidade());
    }

    @Test
    public void elfoNoturnoMorto(){
         ElfoNoturno eld = new ElfoNoturno("a",92);
         for(int x = 1; x < 93; x++){
            eld.atirarFlecha();
        }
        
        assertTrue(eld.getStatus().equals(Status.MORTO));
    }
}

