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
    
    public String imprimir(){
        int tamanho = listaDeItens.size();
        String itens = "";
        for(int x = 0; x < tamanho; x++){
             itens += listaDeItens.get(x).getDescricao() + ",";
        }
        return itens;
    }
    
    public Item itemMaiorQtd(){
        int tamanho = listaDeItens.size();
        int qtd = 0;
        Item itemObj = new Item("",0);
        for(int x = 0; x < tamanho; x++){
            int qtdEstoque = listaDeItens.get(x).getQuantidade();
            if(qtdEstoque>qtd){
                qtd = qtdEstoque;
                itemObj = listaDeItens.get(x);
            }
        }
        return itemObj;
    }
}
