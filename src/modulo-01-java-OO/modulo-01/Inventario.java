import java.util.ArrayList;
public class Inventario
{
    // instance variables - replace the example below with your own
    ArrayList<Item> listaDeItens = new ArrayList<>();
    
    public void adicionarItem(Item item){
        listaDeItens.add(item);
    }
    
    public void removerItem(Item item){
        listaDeItens.remove(item);
    }
    
    public ArrayList<Item> getListadeItens(){
        return listaDeItens;
    }
}
