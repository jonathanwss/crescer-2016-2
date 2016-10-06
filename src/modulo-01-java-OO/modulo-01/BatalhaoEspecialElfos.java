import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
public class BatalhaoEspecialElfos
{
    private HashMap<String, ArrayList<Elfo>> esquadrao = new HashMap<>();
    private HashMap<Status, ArrayList<Elfo>> grupoPorStatus = new HashMap<>();

    public Elfo[] getEsquadrao(){
        //return esquadrao.values().toArray(new Elfo[esquadrao.size()]);
        ArrayList<Elfo> resultado= new ArrayList<>();

        for(ArrayList<Elfo> el : esquadrao.values()){
            resultado.addAll(el);
        }

        return resultado.toArray(new Elfo[resultado.size()]);
    }

    public void alistar(Elfo elfo){
        boolean podeAlistar = elfo instanceof ElfoVerde || elfo instanceof ElfoNoturno;
        if(podeAlistar){
            ArrayList<Elfo> elfoComNome = esquadrao.get(elfo.getNome());
            boolean aindaNaoTemNome = elfoComNome == null;
            if(aindaNaoTemNome){
                ArrayList<Elfo> elfos = new ArrayList<>(Arrays.asList(elfo));
                esquadrao.put(elfo.getNome(),elfos);
            }
        }
    }

    public Elfo buscar(String nome){ 
        return esquadrao.containsKey(nome)? esquadrao.get(nome).get(0) : null;
    }
    
    public void agruparPorStatus(){
        grupoPorStatus.clear(); 
        for (Map.Entry<String, ArrayList<Elfo>> par : esquadrao.entrySet()) { 
            for (Elfo elfo : par.getValue()) { 
                Status status = elfo.getStatus(); 
                ArrayList<Elfo> elfosDoStatus = grupoPorStatus.get(status); 
                boolean aindaNaoAgrupeiPorEsteStatus = elfosDoStatus == null; 
                if (aindaNaoAgrupeiPorEsteStatus) { 
                    elfosDoStatus = new ArrayList<>(); 
                    grupoPorStatus.put(status, elfosDoStatus); 
                } 
                elfosDoStatus.add(elfo); 
            } 
        } 
    }
    
    public ArrayList<Elfo> buscar(Status status) { 
        agruparPorStatus(); 
        return grupoPorStatus.get(status); 
    } 

    //Gambi???
    /*public ArrayList<Elfo> buscar(Status status){
    ArrayList<Elfo> elf = new ArrayList<>();

    for(Elfo elfo : esquadrao.values()){
    if(elfo.getStatus()== status){
    elf.add(elfo);
    }
    }

    return elf;
    }*/

    /*
    public ArrayList<Elfo> buscar(Status status){
    ArrayList<Elfo> elf = new ArrayList<>();

    elf.add(buscaStatus().get(status));

    return elf;
    }

    private  ArrayList<Elfo> organize(){
    ArrayList<Elfo> elf = new ArrayList<>();

    for(Elfo elfo : esquadrao.values()){
    elf.add(elfo);

    }

    return elf;
    }

    private HashMap<Status, Elfo> buscaStatus(){
    HashMap<Status, Elfo> esquadrao2 = new HashMap<>();
    for(Elfo elfo: organize()){
    esquadrao2.put(elfo.getStatus(), elfo);
    }

    return esquadrao2;
    }*/

}
