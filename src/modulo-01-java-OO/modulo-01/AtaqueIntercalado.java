import java.util.*;
public class AtaqueIntercalado implements Estrategia
{   
    public List<Elfo> getOrdemDeAtaque(List<Elfo> atacantes) throws ContingenteDesproporcionalException{
        LinkedList<Elfo> ordemAtaque = new LinkedList<>();

        if(atacantes.size()%2==1){
            throw new ContingenteDesproporcionalException();
        }
        int cont =2;
        for(int x = 0; x < atacantes.size(); x++){

            if(atacantes.get(x) instanceof ElfoVerde && cont%2==0){
                ordemAtaque.add(atacantes.get(x));
                cont++;
            }else if(atacantes.get(x) instanceof ElfoNoturno && cont%2!=0){
                ordemAtaque.add(atacantes.get(x));
                cont++;
            }
        }

        if(atacantes.get(0) instanceof ElfoNoturno){
            ordemAtaque.addFirst(ordemAtaque.getLast());
        }

        return ordemAtaque;
    }

}

