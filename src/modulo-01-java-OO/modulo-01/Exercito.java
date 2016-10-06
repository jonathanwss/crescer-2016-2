import java.util.*;
public class Exercito
{
    private ArrayList<Elfo> exercito = new ArrayList<>();
    public void alistar(Elfo e){
        boolean podeAlistar = e instanceof ElfoVerde || e instanceof ElfoNoturno;
        if(podeAlistar){
            exercito.add(e);
        }
    }

    public ArrayList<Elfo> getExercito(){
        return exercito;
    }

    public Elfo buscar(String nome){
        int cont = exercito.size();
        Elfo elfoEncontrado = null;
        for(int x = 0; x < cont; x++){
            if(exercito.get(x).getNome().equals(nome)){
                elfoEncontrado = exercito.get(x);
                break;
            }
        }
        return elfoEncontrado;
    }

    public ArrayList<Elfo> buscar(Status status){
        ArrayList<Elfo> statusElfo = new ArrayList<>();
        int cont = exercito.size();
        for(int x = 0 ; x < cont ; x++){
            if(status.equals(exercito.get(x).getStatus())){
                statusElfo.add(exercito.get(x));
            }
        }
        return statusElfo;
    }
}
