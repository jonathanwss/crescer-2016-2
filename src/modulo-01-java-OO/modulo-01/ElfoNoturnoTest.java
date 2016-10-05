
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
        ElfoNoturno eld = new ElfoNoturno("a",1000);
        for(int x = 1; x < 100; x++){
            eld.atirarFlecha();
            if(eld.getStatus() == Status.MORTO){
                break;
            }
        }

        assertEquals(126, eld.getExperiencia());

    }

}

