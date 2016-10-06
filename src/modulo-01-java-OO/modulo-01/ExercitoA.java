import java.util.ArrayList;
public interface ExercitoA
{
    Elfo[] getExercito();

    void alistar(Elfo elfo);

    Elfo buscar(String nome);

    ArrayList<Elfo> buscar(Status status);	
}
