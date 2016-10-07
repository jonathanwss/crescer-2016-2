import java.util.*;
public class EstrategiasAtaqueElfos implements Estrategia
{
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
        ArrayList<Elfo> elfosVivos = new ArrayList<>();
        int tamanhoContingente = atacantes.size();

        for(int x = 0; x < tamanhoContingente; x++){
            boolean taVivo = atacantes.get(x).getStatus().equals(Status.VIVO);
            boolean verde = atacantes.get(x) instanceof ElfoVerde;
            if(taVivo && verde){
                elfosVivos.add(atacantes.get(x));
            }
        }
        return elfosVivos;
    }
}
