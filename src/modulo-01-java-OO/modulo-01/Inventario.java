import java.util.ArrayList;
public class Inventario
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> listaDeItens = new ArrayList<>();
    private ArrayList<Item> listaDeItensOrdenados = new ArrayList<>();
    private ArrayList<Item> listaDeItensOrdenadosDecrescente = new ArrayList<>();
    private TipoOrdenacao ordem;

    public void adicionarItem(Item item){
        listaDeItens.add(item);
    }

    public void removerItem(Item item){
        listaDeItens.remove(item);
    }

    public ArrayList<Item> getListadeItens(){
        return listaDeItens;
    }

    public ArrayList<Item> getListadeItensOrdenadosDecrescentes(){
        return listaDeItensOrdenadosDecrescente;
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

    public void ordenarItens(){
        for (int i = 0; i < listaDeItens.size(); i++) {

            for (int j = listaDeItens.size() - 1; j > i; j--) {

                if (listaDeItens.get(i).getQuantidade() > listaDeItens.get(j).getQuantidade()) {

                    listaDeItensOrdenados.add(listaDeItens.get(i));
                    listaDeItens.set(i,listaDeItens.get(j)) ;
                    listaDeItens.set(j,listaDeItensOrdenados.get(i));

                }

            }

        }

    }
    public void ordenarItens(TipoOrdenacao ordem){
        if(ordem.equals("ASCENDENTE")){
            ordenarItens();
        }else{
            ordenarItens();
            int cont = listaDeItens.size();
            for(int x = cont -1; x>=0; x--){
                listaDeItensOrdenadosDecrescente.add(listaDeItens.get(x));
            }
        }
    }

    public void aumentarMilUnidadesItens(){
        int tamanhoMochila = getListadeItens().size();

        for(int x = 0; x < tamanhoMochila; x++){
            int qtd = getListadeItens().get(x).getQuantidade();
            getListadeItens().get(x).setQuantidade(qtd+1000);
        }
    }

    public Item buscar(String descricao){
        int tamanho = listaDeItens.size();
        int posicao = 0;
        for(int x = 0 ; x < tamanho ; x++){
            if(descricao.equals(listaDeItens.get(x).getDescricao())){
                posicao = x;
                break;
            }
        }
        
        return listaDeItens.get(posicao);
    }
    
    public double getMediaQuantidades(){
        int tamanho = getListadeItens().size();
        int contadorQtdItens = 0;
        
        for(int x = 0; x< tamanho; x++){
            contadorQtdItens += listaDeItens.get(x).getQuantidade();
        }
        
        return contadorQtdItens / tamanho;
    }
    
    public int getSomatorioQuantidades(){
        int tamanho = getListadeItens().size();
        int somatorioQtdItens = 0;
        
        for(int x = 0; x< tamanho; x++){
            somatorioQtdItens += listaDeItens.get(x).getQuantidade();
        }
        
        return somatorioQtdItens;
    }
}

