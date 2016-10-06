import java.util.HashMap;
import java.util.ArrayList;
public class BatalhaoEspecialElfos
{
    private HashMap<String, Elfo> esquadrao = new HashMap<>();

    public Elfo[] getEsquadrao(){
        return esquadrao.values().toArray(new Elfo[esquadrao.size()]);
    }

    public void alistar(String desc,Elfo elfo){
        boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if(podeAlistar){
            esquadrao.put(desc,elfo);
        }
    }

    public Elfo buscar(String nome){
        Elfo elfo = null;
        
        elfo  = esquadrao.get(nome);
        
        return elfo;
    }
    
    
    //Gambi???
    public ArrayList<Elfo> buscar(Status status){
        ArrayList<Elfo> elf = new ArrayList<>();
        for(Elfo elfo : esquadrao.values()){
            if(elfo.getStatus()== status){
                elf.add(elfo);
            }
        }
            
        return elf;
    }
}
