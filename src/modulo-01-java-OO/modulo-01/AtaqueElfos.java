import java.util.*;
public class AtaqueElfos implements Estrategia
{
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
        int tamanhoContingente = atacantes.size();
        LinkedList <Elfo> ordemAtaque = new LinkedList<>();
        for(int x = 0; x < tamanhoContingente; x++){
            boolean taVivo = atacantes.get(x).getStatus().equals(Status.VIVO);
            boolean verde = atacantes.get(x) instanceof ElfoVerde;
            if(taVivo && verde){
                ordemAtaque.addFirst(atacantes.get(x));
            }else if(taVivo && !verde){
                ordemAtaque.addLast(atacantes.get(x));
            }
        }
        
        return ordemAtaque;
    }
}
