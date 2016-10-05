import java.util.HashMap;
import java.util.ArrayList;
public class BatalhaoEspecialElfos
{
    private HashMap<String, Elfo> esquadrao = new HashMap<>();

    public HashMap<String, Elfo> getEsquadrao(){
        return esquadrao;
    }

    public void alistar(String desc,Elfo elfo){
        boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if(podeAlistar){
            esquadrao.put(desc,elfo);
        }
    }

}
