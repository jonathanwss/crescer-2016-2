
public class ElfosVerdes extends Elfo{

    public ElfosVerdes(String n) {
        // Chamando construtor debaixo
        this(n, 42);
    }
    
    public ElfosVerdes(String nome, int quantidadeFlechas) {
       super(nome);
       status = Status.VIVO;
       mochila =  super.mochila;
       mochila.getListadeItens().set(0, new Item("Arco de vidro",1));
       mochila.getListadeItens().set(1, new Item("Flechas de vidro",4));
    }

    public void atirarFlechaDobroXp(){
        super.atirarFlecha(new Dwarf());
        super.experiencia++;
    }

    public void adicionarItem(Item item){
        if(item.getDescricao().equals("Arco de vidro") || item.getDescricao().equals("Flechas de vidro")){
            ganharItem(item);
        }
    }

}


