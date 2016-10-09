import java.util.*;
public class EstrategiaAtaqueLittleMumu implements Estrategia
{
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes){
        LinkedList<Elfo> ordemAtaque = new LinkedList<>();
        double numElfosAptos = 0;
        int numElfosNoturnos = 0;
        for(int x = 0; x < atacantes.size(); x++){
            if(atacantes.get(x).getStatus() == Status.VIVO && atacantes.get(x).getFlecha().getQuantidade()>0){
                if(atacantes.get(x) instanceof ElfoVerde){
                    ordemAtaque.addFirst(atacantes.get(x));
                }else{
                    ordemAtaque.addLast(atacantes.get(x));
                    numElfosNoturnos++;
                }
                numElfosAptos++;
            }
        }
        double noturnoPermitido  = numElfosAptos * 0.3;
        int numElfosNoturnosPermitidos = (int) noturnoPermitido;

        numElfosNoturnosPermitidos = numElfosNoturnos - numElfosNoturnosPermitidos;

        for(int y = 0; y < numElfosNoturnosPermitidos; y++){
            ordemAtaque.removeLast();
        }

        for (int i = 0; i < ordemAtaque.size(); i++) {

            for (int j = ordemAtaque.size() - 1; j > i; j--) {

                if (ordemAtaque.get(i).getFlecha().getQuantidade() < ordemAtaque.get(j).getFlecha().getQuantidade()) {
                    ArrayList<Elfo> listaDeItensOrdenados = new ArrayList<>();
                    listaDeItensOrdenados.add(ordemAtaque.get(i));
                    ordemAtaque.set(i,ordemAtaque.get(j)) ;
                    ordemAtaque.set(j,listaDeItensOrdenados.get(i));

                }

            }

        }

        return ordemAtaque;
    }
}