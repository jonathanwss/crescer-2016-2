
public class ElfosVerdes extends Elfo{
    
    public ElfosVerdes(String n) {
        // Chamando construtor debaixo
        this(n, 42, "Arco de vidro", "Flecha de vidro");
    }

    public ElfosVerdes(String nome, int quantidadeFlechas, String item, String item2) {
        super(nome);
        this.mochila = super.mochila;
        
        status = Status.VIVO;
        

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


