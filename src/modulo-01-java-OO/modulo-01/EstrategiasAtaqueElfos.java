import java.util.*;
public class EstrategiasAtaqueElfos implements Estrategia
{
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
        int tamanhoContingente = atacantes.size();

        for(int x = 0; x < tamanhoContingente; x++){
            boolean taVivo = atacantes.get(x).getStatus().equals(Status.VIVO);
            boolean verde = atacantes.get(x) instanceof ElfoVerde;
            if(taVivo && verde){
                atacantes.add(atacantes.get(x));
            }
        }
        
        for(int x = 0; x < tamanhoContingente; x++){
            boolean taVivo = atacantes.get(x).getStatus().equals(Status.VIVO);
            boolean noturno = atacantes.get(x) instanceof ElfoNoturno;
            if(taVivo && noturno){
                atacantes.add(atacantes.get(x));
            }
        }
        
        for(int x = 0; x < tamanhoContingente; x++){
            atacantes.remove(0);
        }
        return atacantes;
    }
}
