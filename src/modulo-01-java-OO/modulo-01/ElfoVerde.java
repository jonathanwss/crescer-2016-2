
public class ElfoVerde extends Elfo{
    
    public ElfoVerde(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }
    
    public ElfoVerde(String nome, int quantidadeFlechas) {
       super(nome,quantidadeFlechas);
       this.inicializarInventario(quantidadeFlechas);
       
    }
    
    @Override
    protected void inicializarInventario(int quantidadeFlechas){
        this.mochila.adicionarItem(new Item("Arco de vidro", 1));
        this.mochila.adicionarItem(new Item("Flechas de vidro", quantidadeFlechas >= 0 ? quantidadeFlechas : 42));
    }
    
    public void atirarFlecha(){
        boolean temFlecha = getFlecha().getQuantidade() > 0;
        if (temFlecha) {
            super.atirarFlecha(new Dwarf());
            this.experiencia +=1;
        }
    }

    public void adicionarItem(Item item){
        
        if(item.getDescricao().equals("Arco e Flechas de vidro") || item.getDescricao().equals("Espada de aço valiriano")){
            ganharItem(item);
        }
    }

}


