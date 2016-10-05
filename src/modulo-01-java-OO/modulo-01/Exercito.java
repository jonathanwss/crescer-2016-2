import java.util.*;
public class Exercito
{
    private ArrayList<Elfo> exercito = new ArrayList<>();
    public void alistarUmEmfo(Elfo e){
        exercito.add(e);
    }

    public ArrayList<Elfo> getExercito(){
        return exercito;
    }
    
    public Elfo buscarElfoPorNome(Elfo e){
        int cont = exercito.size();
        Elfo elfoEncontrado = null;
        for(int x = 0; x < cont; x++){
            if(exercito.get(x).getNome() == e.getNome()){
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
